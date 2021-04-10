package com.spring.cleanmarket.heart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.cleanmarket.heart.model.HeartVO;
import com.spring.cleanmarket.heart.service.IHeartService;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.item.repository.IItemMapper;
import com.spring.cleanmarket.member.model.MemberVO;

@Controller
public class HeartController {

	@Autowired
	private IHeartService service;
	
	//하트를 누름
	@PostMapping("/item/itemHeartCntUpdate")
	@ResponseBody
	public String itemHeartCntUpdate(@Validated @RequestBody HeartVO vo) {
		
		System.out.println("제이쿼리 : "+vo);
		
		String result=null;
		
		//memNo가 일치하는 리스트를 DB에서 가져옴
		List<HeartVO> dbheart = service.getHeartList(vo.getMemNo());
		System.out.println(dbheart);
		
		if(dbheart == null) {
			service.insert(vo);
			result = "insert";
		}else {
			for(HeartVO heart : dbheart) {
				if(heart.getItemNo()==vo.getItemNo()) {
					service.delete(heart.getHeartNo());
					result = "delete";
				}else {
					service.insert(vo);
					result="insert";	
				}
			}
		}
		
		return result;
	}
	
	
}
