package com.spring.cleanmarket.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.cleanmarket.member.model.MemberVO;
import com.spring.cleanmarket.member.service.IMemberService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class MemberController {
	
	@Autowired
	private IMemberService service;
	
	public MemberController() {
		System.out.println("MemberController 작동");
	}
	
	//회원가입유형선택 페이지 요청
	@GetMapping("/join_type_select")
	public String joinTypeSelect() {
		System.out.println("회원가입 유형선택 : /join_type_select -> GET");
		return "member/join_type_select";
	}
	
	//회원가입 동의 페이지 요청
	@GetMapping("/join_agree")
	public String joinAgree(@RequestParam("memType") String memType, Model model) {
		System.out.println("회원가입 동의:/join_agree -> GET ");
		System.out.println("type: "+memType);
		model.addAttribute("memType",memType);
		return "member/join_agree";
	}
	
	//회원가입 입력 폼 페이지 요청
	@GetMapping("/join")
	public String joinType(@RequestParam("memType") String memType){		
		System.out.println("회원가입 정보입력: /join?memType="+memType);

		if(memType.equals("general")) {
			return "member/join_type_general";
		}else {
			return "member/join_type_store";
		}		
	}
	

	//가맹점주 회원가입-매장선택 요청
	@PostMapping("/join/store_detail")
	public String joinStoreDetail(MemberVO member, Model model) {
		System.out.println("가맹점주 매장선택: /join/store_detail");
		System.out.println(member.toString());
		
		model.addAttribute("member",member);
		return "member/join_store_detail";
	}
	
	
	//회원가입 처리 요청
	@PostMapping("/join_result")
	public String joinResult(MemberVO member, Model model) {
		
		System.out.println("회원가입 완료: /join_result -> POST ");
		System.out.println(member.toString());
		
		model.addAttribute("memName",member.getMemName());
		
		member.getMemID();
		member.getMemPassword();
		member.getMemName();
		member.getMemPhone();
		service.join(member);
		return "member/join_result";
	}
	
	//로그인 페이지 요청
	@GetMapping("/login")
	public String login() {
		System.out.println("로그인 페이지 요청 : /login -> GET");
		return "member/login";
	}
	
	//로그인 처리 요청
	@PostMapping("/login")
	public String login(MemberVO member, HttpSession session, RedirectAttributes ra) {	
		System.out.println("로그인 페이지 요청 : /login -> POST");
		
		String result = null;
		
		MemberVO dbData = service.selectOne(member.getMemID());
		
		if(dbData != null) { //아이디가 존재
			if(dbData.getMemPassword().equals(member.getMemPassword())) { //비밀번호 일치
				session.setAttribute("login", dbData);
				result = "loginSuccess";
				
			} else {
				result = "pwFail"; //비밀번호 틀림
			}
		} else {
			result = "idFail"; // 아이디 없음
		}
		
		System.out.println(result);
		ra.addFlashAttribute("msg",result);
		return "redirect:/login";	
	}
	
	//로그아웃 처리
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session, HttpServletRequest request
			,HttpServletResponse response) {

		System.out.println("/logout 요청");

		MemberVO vo = (MemberVO) session.getAttribute("login");

		if(vo != null) {
			session.invalidate();
			//또는 session.removeAttribute("login");

		} 
		return new ModelAndView("redirect:/");
	}
	
	
	@GetMapping("/search")
	public String search_result(@ModelAttribute("keyword") String keyword) {
		System.out.println("검색결과 페이지 요청 : /search?keyword="+keyword);
		return "item/search";
	}

	@GetMapping("/location")
	public String locationChoice(@ModelAttribute("location") String location, HttpSession session) {
		if(location != "") {
			session.setAttribute("location", location);
		}				
		return "redirect:/";
	}
	
	@GetMapping("/reset")
	public ModelAndView reset(HttpSession session) {
		if(session.getAttribute("location") != null) {
			session.invalidate();
		}		
		return new ModelAndView("redirect:/");
	}
	
}	
