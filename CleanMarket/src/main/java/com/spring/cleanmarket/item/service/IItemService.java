package com.spring.cleanmarket.item.service;

import java.util.List;

import com.spring.cleanmarket.item.commons.SearchVO;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.member.model.MemberVO;

public interface IItemService {

	//상품 등록 기능
	void write(ItemVO item);
	
	//상품 정보 조회 기능
	ItemVO selectOne(int itemNo);
	
	//게시글 수정 기능
	void update(ItemVO item);

	//게시글 삭제 기능
	void delete(int itemNo);

	//검색어,카테고리,지역설정이 포함된 목록 조회 기능
	List<ItemVO> getItemList(SearchVO search);
	
	//게시글 작성자 정보 조회
	MemberVO getWriterOne(int memNo);
	
	//회원 등록 상품 목록 조회
	List<ItemVO> getmemItem(int memNo); 
	
	/*
	//카테고리별 상품 검색
	List<ItemVO> CategorySelect(String itemCategory); 
	
	//검색어로 검색한 상품 조회
	List<ItemVO> keywordItem(SearchVO keyword);
	
	//지역설정 상품 조회
	List<ItemVO> locationItem(SearchVO location);
	*/
}
