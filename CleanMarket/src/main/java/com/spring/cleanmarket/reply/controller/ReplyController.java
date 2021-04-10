package com.spring.cleanmarket.reply.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.cleanmarket.member.model.MemberVO;
import com.spring.cleanmarket.qna.model.QnaVO;
import com.spring.cleanmarket.reply.model.ReplyVO;
import com.spring.cleanmarket.reply.service.IReplyService;

@Controller
@RequestMapping("qna/detail")
public class ReplyController {
	
	@Autowired
	private IReplyService service;
	
	@PostMapping("add_reply")
	public String addReply(ReplyVO vo, HttpSession session) {
		System.out.println("qna/detail/add_reply -> POST");
		
		MemberVO member = (MemberVO) session.getAttribute("login");
		
		vo.setRepWriter(member.getMemID());
		service.replywrite(vo);
		System.out.println(vo.toString());
		
		return "redirect:/qna/detail/"+vo.getQnaNo();
	}
	
	@PostMapping("delete_reply")
	public String deleteReply(int qnaNo, ReplyVO vo) {
		System.out.println("qna/detail/delete_reply : "+vo.getRepNo()+"번 게시글 댓글 삭제");
		System.out.println(vo);
		service.replydelete(vo.getRepNo());
		return "redirect:/qna/detail/"+qnaNo;
	}
	
	
}
