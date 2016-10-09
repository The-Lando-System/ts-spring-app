package com.mattvoget.tsspring.models;

import org.springframework.data.annotation.Id;

public class Note {
	
	@Id private String id;
	
	private String title;
	private String details;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}

}