package com.spring.cleanmarket.item.model;

import java.sql.Date;

public class ItemVO {
	
	private int itemNo;
	private int memNo;
	private String itemTitle;
	private String itemCategory;
	private String itemContent;
	private String itemPrice;
	private String itemPriceOption;
	private String itemFiradd;
	private String itemSecadd;
	private String itemState;
	private Date itemRegdate;
	private int itemViewCnt;
	private int itemHeartCnt;
	
	//신규게시물에 new 마크를 붙일지 말지를 결정하는 논리필드 선언
	private boolean newMark;

	public void setNewMark(boolean newMark) {
		this.newMark = newMark;
	}

	public boolean isNewMark() { //boolean은 get대신 is
		return newMark;
	}

	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemPriceOption() {
		return itemPriceOption;
	}
	public void setItemPriceOption(String itemPriceOption) {
		this.itemPriceOption = itemPriceOption;
	}
	public String getItemFiradd() {
		return itemFiradd;
	}
	public void setItemFiradd(String itemFiradd) {
		this.itemFiradd = itemFiradd;
	}
	public String getItemSecadd() {
		return itemSecadd;
	}
	public void setItemSecadd(String itemSecadd) {
		this.itemSecadd = itemSecadd;
	}
	public String getItemState() {
		return itemState;
	}
	public void setItemState(String itemState) {
		this.itemState = itemState;
	}
	public Date getItemRegdate() {
		return itemRegdate;
	}
	public void setItemRegdate(Date itemRegdate) {
		this.itemRegdate = itemRegdate;
	}
	public int getItemViewCnt() {
		return itemViewCnt;
	}
	public void setItemViewCnt(int itemViewCnt) {
		this.itemViewCnt = itemViewCnt;
	}
	public int getItemHeartCnt() {
		return itemHeartCnt;
	}
	public void setItemHeartCnt(int itemHeartCnt) {
		this.itemHeartCnt = itemHeartCnt;
	}
	
	
	@Override
	public String toString() {
		return "ItemVO [itemNo=" + itemNo + ", memNo=" + memNo + ", itemTitle=" + itemTitle + ", itemCategory="
				+ itemCategory + ", itemContent=" + itemContent + ", itemPrice=" + itemPrice + ", itemPriceOption="
				+ itemPriceOption + ", itemFiradd=" + itemFiradd + ", itemSecadd=" + itemSecadd + ", itemState="
				+ itemState + ", itemRegdate=" + itemRegdate + ", itemViewCnt=" + itemViewCnt + ", itemHeartCnt="
				+ itemHeartCnt + "]";
	}	
	
}
