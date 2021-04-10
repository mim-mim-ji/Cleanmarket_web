package com.spring.cleanmarket.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cleanmarket.qna.model.QnaVO;
import com.spring.cleanmarket.qna.repository.IQnaMapper;

@Service
public class QnaService implements IQnaService{

	@Autowired
	private IQnaMapper mapper;
	
	@Override
	public void qnawrite(QnaVO vo) {
		if(vo.getQnaHidden()!=null) { //비밀글 체크
			vo.setQnaHidden("y");
		}else {
			vo.setQnaHidden("n");
		}
		mapper.qnawrite(vo);
	}

	@Override
	public QnaVO qnadetail(int qnaNo) {
		return mapper.qnadetail(qnaNo);
	}

	@Override
	public void qnaupdate(QnaVO vo) {
		if(vo.getQnaHidden()!=null) { //비밀글 체크
			vo.setQnaHidden("y");
		}else {
			vo.setQnaHidden("n");
		}
		mapper.qnaupdate(vo);
	}

	@Override
	public void qnadelete(int qnaNo) {
		mapper.qnadelete(qnaNo);
	}

	@Override
	public List<QnaVO> getqnaList(int itemNo) {
		return mapper.getqnaList(itemNo);
	}

	@Override
	public List<QnaVO> userqnaList(String qnaWriter) {
		return mapper.userqnaList(qnaWriter);
	}
	
	
}
