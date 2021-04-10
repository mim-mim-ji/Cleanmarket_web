package com.spring.cleanmarket.heart.service;

import java.util.List;

import com.spring.cleanmarket.heart.model.HeartVO;

public interface IHeartService {
	
	//관심상품으로 등록
	void insert(HeartVO vo);
	
	//관심상품에서 삭제
	void delete(int heartNo);

	//상품의 하트 수
	int itemHeartCnt(int itemNo);
	
	//사용자의 하트 목록 가져오기
	List<HeartVO> getHeartList(int memNo);
	
	
}
