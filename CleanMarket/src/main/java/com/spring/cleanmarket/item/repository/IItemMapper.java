package com.spring.cleanmarket.item.repository;

import java.util.List;

import com.spring.cleanmarket.item.commons.SearchVO;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.member.model.MemberVO;

public interface IItemMapper {
	
	//상품 등록 기능
	void write(ItemVO item);

	//상품 정보 조회 기능
	ItemVO selectOne(int itemNo);

	//게시글 조회수 상승 처리
	void updateViewCnt(int itemNo);

	//게시글 수정 기능
	void update(ItemVO item);

	//게시글 삭제 기능
	void delete(int itemNo);

	//게시물 목록 조회 기능
	List<ItemVO> getItemList(); 
	
}
