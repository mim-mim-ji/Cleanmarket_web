package com.spring.cleanmarket.reply.service;

import java.util.List;

import com.spring.cleanmarket.reply.model.ReplyVO;

public interface IReplyService {
	//댓글 등록 기능
	void replywrite(ReplyVO vo);

	//댓글 수정 기능
	void replyupdate(ReplyVO vo);

	//댓글 삭제 기능
	void replydelete(int repNo);

	//댓글 목록 조회 기능
	List<ReplyVO> getreplyList(int qnaNo);

}
