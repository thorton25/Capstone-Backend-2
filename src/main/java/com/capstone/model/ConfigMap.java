package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_configmap")
public class ConfigMap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "CMAPID")
	private Long cmapId;
	
	@Column (name = "CMAPDATE")
	private String date;
	
	@Column (name = "REPORTID")
	private Integer reportId;
	
	public ConfigMap() {
		
	}

	public ConfigMap(Long cmapId, String date, Integer reportId) {
		super();
		this.cmapId = cmapId;
		this.date = date;
		this.reportId = reportId;
	}

	public Long getCmapId() {
		return cmapId;
	}

	public void setCmapId(Long cmapId) {
		this.cmapId = cmapId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	

}
