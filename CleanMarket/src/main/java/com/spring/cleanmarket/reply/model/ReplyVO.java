package com.spring.cleanmarket.reply.model;

import java.sql.Date;

public class ReplyVO {
	private int repNo;
	private int qnaNo;
	private String repContent;
	private String repWriter;
	private Date repRegdate;
	
	public int getRepNo() {
		return repNo;
	}
	public void setRepNo(int repNo) {
		this.repNo = repNo;
	}
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public String getRepContent() {
		return repContent;
	}
	public void setRepContent(String repContent) {
		this.repContent = repContent;
	}
	public String getRepWriter() {
		return repWriter;
	}
	public void setRepWriter(String repWriter) {
		this.repWriter = repWriter;
	}
	public Date getRepRegdate() {
		return repRegdate;
	}
	public void setRepRegdate(Date repRegdate) {
		this.repRegdate = repRegdate;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [repNo=" + repNo + ", qnaNo=" + qnaNo + ", repContent=" + repContent + ", repWriter="
				+ repWriter + ", repRegdate=" + repRegdate + "]";
	}	
	
}
