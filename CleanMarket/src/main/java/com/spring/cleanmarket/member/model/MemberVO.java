package com.spring.cleanmarket.member.model;

import java.sql.Date;

public class MemberVO {
	
	private int memNo;
	private String memID;
	private String memPassword;
	private String memName;
	private String memPhone;
	private String memFiradd;
	private String memSecadd;
	private String storeName;
	private Date memRegdate;
	private String memType;
	
	
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getMemPassword() {
		return memPassword;
	}
	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemFiradd() {
		return memFiradd;
	}
	public void setMemFiradd(String memFiradd) {
		this.memFiradd = memFiradd;
	}
	public String getMemSecadd() {
		return memSecadd;
	}
	public void setMemSecadd(String memSecadd) {
		this.memSecadd = memSecadd;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Date getMemRegdate() {
		return memRegdate;
	}
	public void setMemRegdate(Date memRegdate) {
		this.memRegdate = memRegdate;
	}
	public String getMemType() {
		return memType;
	}
	public void setMemType(String memType) {
		this.memType = memType;
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [memNo=" + memNo + ", memID=" + memID + ", memPassword=" + memPassword + ", memName=" + memName
				+ ", memPhone=" + memPhone + ", memFiradd=" + memFiradd + ", memSecadd=" + memSecadd + ", storeName="
				+ storeName + ", memRegdate=" + memRegdate + ", memType=" + memType + "]";
	}
	
	
	
}
