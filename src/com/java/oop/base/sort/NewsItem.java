package com.java.oop.base.sort;

import java.util.Date;

public class NewsItem implements Comparable<NewsItem> {
	
	
	//按时间降序+ 点击量升序 + 标题升序
	@Override
	public int compareTo(NewsItem o) {
		// TODO Auto-generated method stub
		return 0;
	}
	private String title;
	private long hits;
	private Date pubTime;
	
	
	public NewsItem() {
		
	}
	public NewsItem(String title,long hits,Date pubTime) {
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getHits() {
		return hits;
	}
	public void setHits(long hits) {
		this.hits = hits;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
	

}
