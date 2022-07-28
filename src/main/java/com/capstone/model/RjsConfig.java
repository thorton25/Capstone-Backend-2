package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rjsconfig")
public class RjsConfig {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "PK_RJSCONFIGID")
	private Long pk_RjsConfigId;
	
	@Column (name = "SSOID")
	private String ssoId;
	
	@Column (name = "TYPEOFSEARCH")
	private Integer typeOfSearch;
	
	@Column (name = "SEARCHTEXT")
	private String searchText;
	
	@Column (name = "CONFIGID")
	private Integer configId;
	
	public RjsConfig( ) {
		
	}
	
	public RjsConfig(Long pk_RjsConfigId, String ssoId, Integer typeOfSearch,
			 Integer configId, String searchText ) {
		super();
		this.pk_RjsConfigId = pk_RjsConfigId;
		this.ssoId = ssoId;
		this.typeOfSearch = typeOfSearch;
		this.searchText = searchText;
		this.configId = configId;
	}
	
	public Long getPk_RjsConfigId() {
		return pk_RjsConfigId;
	}
	public void setPk_RjsConfigId(Long pk_RjsConfigId) {
		this.pk_RjsConfigId = pk_RjsConfigId;
	}
	public String getSsoId() {
		return ssoId;
	}
	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}
	public Integer getTypeOfSearch() {
		return typeOfSearch;
	}
	public void setTypeOfSearchH(Integer typeOfSearch) {
		this.typeOfSearch = typeOfSearch;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSEARCHTEXT(String sEARCHTEXT) {
		this.searchText = sEARCHTEXT;
	}
	public Integer getConfigId() {
		return configId;
	}
	public void setConfigId(Integer configId) {
		this.configId = configId;
	}
}