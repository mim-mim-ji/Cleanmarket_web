package com.spring.cleanmarket.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cleanmarket.reply.model.ReplyVO;
import com.spring.cleanmarket.reply.repository.IReplyMapper;

@Service
public class ReplyService implements IReplyService{
	
	@Autowired
	private IReplyMapper mapper;

	@Override
	public void replywrite(ReplyVO vo) {
		mapper.replywrite(vo);
	}

	@Override
	public void replyupdate(ReplyVO vo) {
		mapper.replyupdate(vo);
	}

	@Override
	public void replydelete(int repNo) {
		mapper.replydelete(repNo);
	}

	@Override
	public List<ReplyVO> getreplyList(int qnaNo) {
		return mapper.getreplyList(qnaNo);
	}
	
}