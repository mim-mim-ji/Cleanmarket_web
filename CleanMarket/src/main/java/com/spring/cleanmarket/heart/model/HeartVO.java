package com.spring.cleanmarket.heart.model;

import java.sql.Date;

public class HeartVO {
	private int heartNo;
	private int memNo;
	private int itemNo;
	private Date heartRegdate;
	
	public int getHeartNo() {
		return heartNo;
	}
	public void setHeartNo(int heartNo) {
		this.heartNo = heartNo;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public Date getHeartRegdate() {
		return heartRegdate;
	}
	public void setHeartRegdate(Date heartRegdate) {
		this.heartRegdate = heartRegdate;
	}
	
	@Override
	public String toString() {
		return "HeartVO [heartNo=" + heartNo + ", memNo=" + memNo + ", itemNo=" + itemNo + ", heartRegdate="
				+ heartRegdate + "]";
	}
	
	
	
}
