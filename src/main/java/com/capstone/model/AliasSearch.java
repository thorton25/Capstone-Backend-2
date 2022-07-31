package com.capstone.model;

public class AliasSearch {
	
	private String reportName;
	private String aliasName;
	
	public AliasSearch() {
		
	}

	public AliasSearch(String reportName, String aliasName) {
		super();
		this.reportName = reportName;
		this.aliasName = aliasName;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	

}
