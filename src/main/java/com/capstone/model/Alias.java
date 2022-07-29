package com.capstone.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_alias")
public class Alias implements Serializable {
	
	@Id
	@Column (name = "ALIASID")
	private Integer aliasId;
	
	@Column (name = "REPORTID")
	private Integer reportId;
	
	@Column (name = "ALIAS")
	private String aliasName;
	
	@OneToOne(targetEntity=Report.class, mappedBy="alias")
	private Report report;
	
	public Alias() {
		
	}
	
	public Alias(String aliasName, Report report) {
		super();
		this.aliasName = aliasName;
		this.report = report;
	}

	public Alias(Integer aliasId, Integer reportId, String aliasName, Report report) {
		super();
		this.aliasId = aliasId;
		this.reportId = reportId;
		this.aliasName = aliasName;
		this.report = report;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public Integer getAliasId() {
		return aliasId;
	}

	public void setAliasId(Integer aliasId) {
		this.aliasId = aliasId;
	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	
}
