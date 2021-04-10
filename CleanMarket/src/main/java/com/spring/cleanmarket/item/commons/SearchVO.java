package com.spring.cleanmarket.item.commons;

public class SearchVO {
	
	private String keyword;
	private String location;
	private String category;

	public SearchVO() {
		this.keyword = "";
		this.location = "";
		this.category = "";
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SearchVO [keyword=" + keyword + ", location=" + location + ", category=" + category + "]";
	}		
	
}
