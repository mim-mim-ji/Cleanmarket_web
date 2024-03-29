package com.spring.cleanmarket.mypage.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.item.repository.IItemMapper;
import com.spring.cleanmarket.member.model.MemberVO;
import com.spring.cleanmarket.member.service.IMemberService;
import com.spring.cleanmarket.qna.model.QnaVO;
import com.spring.cleanmarket.qna.repository.IQnaMapper;

@Controller
@RequestMapping("mypage")
public class MypageController {
	
	@Autowired
	private IMemberService service;
	
	@Autowired
	private IItemMapper itemservice;
	
	@Autowired
	private IQnaMapper qnaservice;
	
	//판매중 페이지 요청
	@GetMapping("/items/selling")
	public String itemselling(HttpSession session, ItemVO vo, Model model) {
		System.out.println("판매내역 -> 판매중 아이템 리스트 요청");
		
		MemberVO mem = (MemberVO)session.getAttribute("login");
		
		List<ItemVO> list = itemservice.getmemItem(mem.getMemNo());
		
		model.addAttribute("itemlist",list);
		return "mypage/items_selling";
	}
	
	//예약중 페이지 요청
	@GetMapping("/items/reserve")
	public String itemsReserve(HttpSession session, ItemVO vo, Model model) {
		System.out.println("판매내역 -> 예약중 아이템 리스트 요청");
		
		MemberVO mem = (MemberVO)session.getAttribute("login");
		
		List<ItemVO> list = itemservice.getmemItem(mem.getMemNo());
		
		model.addAttribute("itemlist",list);
		return "mypage/items_reserve";
	}
	
	//매장보관중 페이지 요청
	@GetMapping("/items/store")
	public String itemsStore(HttpSession session, ItemVO vo, Model model) {
		System.out.println("판매내역 -> 매장보관중 아이템 리스트 요청");
		
		MemberVO mem = (MemberVO)session.getAttribute("login");
		
		List<ItemVO> list = itemservice.getmemItem(mem.getMemNo());
		
		model.addAttribute("itemlist",list);
		return "mypage/items_store";
	}
	
	//거래완료 페이지 요청
	@GetMapping("/items/complete")
	public String itemsComplete(HttpSession session, ItemVO vo, Model model) {
		System.out.println("판매내역 -> 거래완료 아이템 리스트 요청");
		
		MemberVO mem = (MemberVO)session.getAttribute("login");
		
		List<ItemVO> list = itemservice.getmemItem(mem.getMemNo());
		
		model.addAttribute("itemlist",list);
		return "mypage/items_complete";
	}
	
	//회원정보 수정 페이지 요청
	@GetMapping("/modify")
	public String modify() {
		System.out.println("회원 정보 수정 페이지 요청");
		return "mypage/modify_general";
	}
	
	//회원정보 수정 처리 요청
	@PostMapping("/modify")
	public String modify(MemberVO vo, RedirectAttributes ra,HttpSession session) {
		System.out.println("회원정보 수정 처리요청 : /mypage/modify -> POST");
		
		MemberVO member = service.selectOne(vo.getMemID());
		System.out.println(member);
		
		if(member.getMemPassword().equals(vo.getMemPassword())) {			
			System.out.println(vo);
			service.update(vo);
			session.setAttribute("login",vo);
			System.out.println("회원 정보 수정 완료");
			ra.addFlashAttribute("msg","modSuccess");		
		}else {
			System.out.println("비밀번호 불일치");
			ra.addFlashAttribute("msg","modFail");
		}
		return "redirect:/mypage/modify";
	}
	
	//qna리스트 페이지요청
	@GetMapping("/qna_list")
	public String qnaList(HttpSession session, Model model) {
		System.out.println("qna 리스트 페이지 요청 : /mypage/qna_list");
		
		MemberVO mem = (MemberVO)session.getAttribute("login");
		
		List<QnaVO> list = qnaservice.userqnaList(mem.getMemID());
		model.addAttribute("qnalist",list);
		
		return "mypage/qna_list";
	}
	
}
