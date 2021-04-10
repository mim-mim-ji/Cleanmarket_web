package com.spring.cleanmarket.qna.service;

import java.util.List;

import com.spring.cleanmarket.qna.model.QnaVO;

public interface IQnaService {
	
	//질문 등록 기능
	void qnawrite(QnaVO vo);

	//질문 상세 조회 기능
	QnaVO qnadetail(int qnaNo);

	//질문 수정 기능
	void qnaupdate(QnaVO vo);

	//질문 삭제 기능
	void qnadelete(int qnaNo);

	//질문 목록 조회 기능
	List<QnaVO> getqnaList(int itemNo);
	
	//사용자가 작성한 질문 목록 조회
	List<QnaVO> userqnaList(String qnaWriter);
}
