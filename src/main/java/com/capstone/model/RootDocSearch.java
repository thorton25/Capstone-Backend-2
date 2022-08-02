package com.capstone.model;

public class RootDocSearch {
	
	private Long id;
	private String title;
	private String description;
	private String cDate;
	private String rTime;
	private String pDate;
	
	public RootDocSearch(Long id, String title, String description, String cDate, String rTime, String pDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.cDate = cDate;
		this.rTime = rTime;
		this.pDate = pDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

	public String getrTime() {
		return rTime;
	}

	public void setrTime(String rTime) {
		this.rTime = rTime;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

}
