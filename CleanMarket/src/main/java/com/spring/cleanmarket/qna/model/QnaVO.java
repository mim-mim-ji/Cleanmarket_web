package com.spring.cleanmarket.qna.model;

import java.sql.Date;

public class QnaVO {
	private int qnaNo;
	private int itemNo;
	private String qnaTitle;
	private String qnaContent;
	private String qnaWriter;
	private Date qnaRegdate;
	private String qnaHidden;
	
	public String getQnaHidden() {
		return qnaHidden;
	}
	public void setQnaHidden(String qnaHidden) {
		this.qnaHidden = qnaHidden;
	}
	
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public String getQnaWriter() {
		return qnaWriter;
	}
	public void setQnaWriter(String qnaWriter) {
		this.qnaWriter = qnaWriter;
	}
	public Date getQnaRegdate() {
		return qnaRegdate;
	}
	public void setQnaRegdate(Date qnaRegdate) {
		this.qnaRegdate = qnaRegdate;
	}
	
	@Override
	public String toString() {
		return "QnaVO [qnaNo=" + qnaNo + ", itemNo=" + itemNo + ", qnaTitle=" + qnaTitle + ", qnaContent=" + qnaContent
				+ ", qnaWriter=" + qnaWriter + ", qnaRegdate=" + qnaRegdate + ", qnaHidden=" + qnaHidden + "]";
	}
	
	
	
}
