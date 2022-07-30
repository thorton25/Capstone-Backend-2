package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "t_report")
@SecondaryTable(name = "t_alias", pkJoinColumns = @PrimaryKeyJoinColumn(name = "REPORTID"))
public class Report {
	
	@Id
	@Column (name = "REPORTID")
	private Long id;
	
	@Column (name = "REPORTNAME")
	private String name;
	
	@Column (name = "HISTORYMAXDAYS")
	private Integer historyMaxDays;
	
	@Column (name = "NONSPOOLFILE")
	private Integer nonSpoolFile;
	
	@Column (name = "DESCRIPTION")
	private String description;
	
	@Column (name = "EXPIRATIONDAYS")
	private Integer expirationDays;
	
	@Column (name = "SKIPPAGES")
	private Integer skipPages;
	
	@Column (name = "CREATIONDATE")
	private String creationDate;
	
	@Column (name = "ALLOWPRNT")
	private String allowPrint;
	
	@Column (name = "ADDEDBY")
	private String addedBy;
	
	@Column (name = "MODIFIEDBY")
	private String modifiedBy;
	
	@Column (name = "AS400ID")
	private Integer as400Id;
	
	@Column (name = "STATUS")
	private char status;
	
	@Column (name = "MULTIREPORTS")
	private String multiReports;
	
	@Column (name = "ALLOWOVERRIDES")
	private Integer allowOverrides;
	
	@Column (name = "NUMCOLUMNS")
	private Integer numCols;
	
	@Column (name = "CONFIDENTIAL")
	private String confidential;
	
	@Column (name = "BIREPORT")
	private String biReport;
	
	@Column (name = "HELP")
	private String help;
	
	@Column (name = "DETAILDESCRIPTION")
	private String detailDescription;
	
	@Column (name = "COMBINE_PDF_REPORT")
	private Integer combinePdfReport;
	
	@Column (name = "ALIAS", table = "t_alias")
	private String aliasName;
	

	
	public Report() {
		
	}

	public Report(Long id, String name, Integer historyMaxDays, Integer nonSpoolFile, String description,
			Integer expirationDays, Integer skipPages,
			String creationDate, String allowPrint, String addedBy, String modifiedBy, Integer as400Id, char status,
			String multiReports, Integer allowOverrides, Integer numCols,
			String confidential, String biReport, String help, String detailDescription,
			Integer combinePdfReport, String aliasName) {
		super();
		this.id = id;
		this.name = name;
		this.historyMaxDays = historyMaxDays;
		this.nonSpoolFile = nonSpoolFile;
		this.description = description;
		this.expirationDays = expirationDays;
		this.skipPages = skipPages;
		this.creationDate = creationDate;
		this.allowPrint = allowPrint;
		this.addedBy = addedBy;
		this.modifiedBy = modifiedBy;
		this.as400Id = as400Id;
		this.status = status;
		this.multiReports = multiReports;
		this.allowOverrides = allowOverrides;
		this.numCols = numCols;
		this.confidential = confidential;
		this.biReport = biReport;
		this.help = help;
		this.detailDescription = detailDescription;
		this.combinePdfReport = combinePdfReport;
		this.aliasName = aliasName;
	
	}
	
	

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHistoryMaxDays() {
		return historyMaxDays;
	}

	public void setHistoryMaxDays(Integer historyMaxDays) {
		this.historyMaxDays = historyMaxDays;
	}

	public Integer getNonSpoolFile() {
		return nonSpoolFile;
	}

	public void setNonSpoolFile(Integer nonSpoolFile) {
		this.nonSpoolFile = nonSpoolFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(Integer expirationDays) {
		this.expirationDays = expirationDays;
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

	public String getAllowPrint() {
		return allowPrint;
	}

	public void setAllowPrint(String allowPrint) {
		this.allowPrint = allowPrint;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Integer getAs400Id() {
		return as400Id;
	}

	public void setAs400Id(Integer as400Id) {
		this.as400Id = as400Id;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getMultiReports() {
		return multiReports;
	}

	public void setMultiReports(String multiReports) {
		this.multiReports = multiReports;
	}

	public Integer getAllowOverrides() {
		return allowOverrides;
	}

	public void setAllowOverrides(Integer allowOverrides) {
		this.allowOverrides = allowOverrides;
	}

	public Integer getNumCols() {
		return numCols;
	}

	public void setNumCols(Integer numCols) {
		this.numCols = numCols;
	}

	public String getConfidential() {
		return confidential;
	}

	public void setConfidential(String confidential) {
		this.confidential = confidential;
	}

	public String getBiReport() {
		return biReport;
	}

	public void setBiReport(String biReport) {
		this.biReport = biReport;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public Integer getCombinePdfReport() {
		return combinePdfReport;
	}

	public void setCombinePdfReport(Integer combinePdfReport) {
		this.combinePdfReport = combinePdfReport;
	}

}
