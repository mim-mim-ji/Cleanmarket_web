package com.spring.cleanmarket.heart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cleanmarket.heart.model.HeartVO;
import com.spring.cleanmarket.heart.repository.IHeartMapper;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.item.repository.IItemMapper;

@Service
public class HeartService implements IHeartService{

	@Autowired
	private IHeartMapper mapper;
	
	@Override
	public void insert(HeartVO vo) {		
		mapper.insert(vo); //관심상품 DB에 추가
	}	

	@Override
	public void delete(int heartNo) {
		mapper.delete(heartNo); //관심상품DB에서 제거
	}

	@Override
	public int itemHeartCnt(int itemNo) {
		return mapper.itemHeartCnt(itemNo);
	}

	@Override
	public List<HeartVO> getHeartList(int memNo) {
		return mapper.getHeartList(memNo);
	}


	
}
