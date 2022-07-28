package com.capstone.model;
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
public class Alias {
	
	@Id
	@Column (name = "ALIASID")
	private Long aliasId;
	
	@Column (name = "REPORTID")
	private Long reportId;
	
	@Column (name = "ALIAS")
	private String aliasName;
	
	@OneToOne(targetEntity=Report.class, mappedBy="alias")
	private Report report;
	
	public Alias() {
		
	}

	public Alias(Long aliasId, Long reportId, String aliasName, Report report) {
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

	public Long getAliasId() {
		return aliasId;
	}

	public void setAliasId(Long aliasId) {
		this.aliasId = aliasId;
	}

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	
}
