package com.capstone.model;

public class ConfigSearch {
	
	private String reportName;
	private String as400Name;
	private String dimTypeName;
	private String dimValue;
	
	public ConfigSearch(String reportName, String as400Name, String dimTypeName, String dimValue) {
		super();
		this.reportName = reportName;
		this.as400Name = as400Name;
		this.dimTypeName = dimTypeName;
		this.dimValue = dimValue;
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

	public String getDimTypeName() {
		return dimTypeName;
	}

	public void setDimTypeName(String dimTypeName) {
		this.dimTypeName = dimTypeName;
	}

	public String getDimValue() {
		return dimValue;
	}

	public void setDimValue(String dimValue) {
		this.dimValue = dimValue;
	}
	
	

}
