package com.spring.cleanmarket.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cleanmarket.item.commons.SearchVO;
import com.spring.cleanmarket.item.model.ItemVO;
import com.spring.cleanmarket.item.repository.IItemMapper;
import com.spring.cleanmarket.member.model.MemberVO;

@Service
public class ItemService implements IItemService{

	@Autowired
	private IItemMapper mapper;
	
	@Override
	public void write(ItemVO item) {
		if(item.getItemPriceOption()!=null) {
			item.setItemPriceOption("y");
		}else {
			item.setItemPriceOption("n");
		}
		
		if(item.getItemFiradd()==null) { //첫번째 체크박스 체크X			
			if(item.getItemSecadd()!=null) { //두번째만 체크햇을때
				item.setItemFiradd(item.getItemSecadd()); //두번째 주소를 첫번째에 저장 
				item.setItemSecadd("null");  //두번째는 null
			}
		}else { //첫번째 체크박스 체크O
			if(item.getItemSecadd()==null) { //두번째 체크X
				item.setItemSecadd("null"); //두번째는 null
			}
		}
		System.out.println(item.toString());
		mapper.write(item);
	}

	@Override
	public ItemVO selectOne(int itemNo) {
		mapper.updateViewCnt(itemNo); //조회수 상승 처리
		return mapper.selectOne(itemNo);
	}

	@Override
	public List<ItemVO> getItemList() {
		List<ItemVO> list = mapper.getItemList();

		//1일 이내 신규글 new마크처리
		for(ItemVO item:list) {
			//현재 시간 읽어오기
			long now = System.currentTimeMillis(); //현재 시간을 밀리초로 리턴하는 메서드
			//각 게시물들의 작성 시간을 밀리초로 읽어오기
			long regTime = item.getItemRegdate().getTime();
			if(now - regTime < 60*60*24*1000) { //하루, 밀리초니까 1000곱해줌
				item.setNewMark(true);
			}
		}

		return list;
	}

	

	@Override
	public void update(ItemVO item) {
		mapper.update(item);
	}

	@Override
	public void delete(int itemNo) {
		mapper.delete(itemNo);
	}

}
