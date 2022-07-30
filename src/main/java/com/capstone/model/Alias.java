package com.capstone.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_alias")
public class Alias {
	
	@Id
	@Column (name = "ALIASID")
	private Long aliasId;
	
	@Column (name = "REPORTID")
	private Integer reportId;
	
	@Column (name = "ALIAS")
	private String aliasName;
	
	public Alias() {
		
	}

	public Alias(Long aliasId, Integer reportId, String aliasName) {
		super();
		this.aliasId = aliasId;
		this.reportId = reportId;
		this.aliasName = aliasName;
	}


	public Long getAliasId() {
		return aliasId;
	}

	public void setAliasId(Long aliasId) {
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
