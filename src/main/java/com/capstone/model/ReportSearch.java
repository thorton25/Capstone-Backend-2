package com.capstone.model;

public class ReportSearch {
	
	private String reportName;
	private String as400Name;
	private char status;
	private Integer nonSpoolFile;
	private Integer skipPages;
	private String creationDate;
	
	public ReportSearch(String reportName, String as400Name, char status, Integer nonSpoolFile, Integer skipPages,
			String creationDate) {
		super();
		this.reportName = reportName;
		this.as400Name = as400Name;
		this.status = status;
		this.nonSpoolFile = nonSpoolFile;
		this.skipPages = skipPages;
		this.creationDate = creationDate;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getAs400Name() {
		return as400Name;
	}

	public void setAs400Name(String as400Name) {
		this.as400Name = as400Name;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Integer getNonSpoolFile() {
		return nonSpoolFile;
	}

	public void setNonSpoolFile(Integer nonSpoolFile) {
		this.nonSpoolFile = nonSpoolFile;
	}

	public Integer getSkipPages() {
		return skipPages;
	}

	public void setSkipPages(Integer skipPages) {
		this.skipPages = skipPages;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	

}
