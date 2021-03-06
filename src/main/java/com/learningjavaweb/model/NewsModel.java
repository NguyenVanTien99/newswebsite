package com.learningjavaweb.model;

public class NewsModel extends AbstractModel<NewsModel> {
	
	private String title;
	private String thumbnail;
	private String shortDecription;
	private String content;
	private Long categoryId;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortDecription() {
		return shortDecription;
	}
	public void setShortDecription(String shortDecription) {
		this.shortDecription = shortDecription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	

	


}
