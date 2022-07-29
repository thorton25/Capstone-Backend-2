package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_dimtype")
public class DimType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "DIMTD")
	private Long id;
	
	@Column (name = "DIMTNAME")
	private String name;
	
	@Column (name = "DIMTDATE")
	private String date;
	
	@Column (name = "DIMVALID")
	private Integer valId;
	
	@Column (name = "DIMCID")
	private Integer cId;
	
	@Column (name = "DIMTMULTIREAD")
	private Integer multiRead;
	
	@Column (name = "DIMTMULTIUSE")
	private Integer multiUse;
	
	@Column (name = "DIMLVLID")
	private Integer lvlId;
	
	@Column (name = "OVERRIDES")
	private Integer overRides;
	
	@Column (name = "DIMGROUPS")
	private Integer groups;
	
	public DimType() {
		
	}
	
	public DimType(Long id, String name, String date, Integer valId, Integer cId, Integer multiRead, 
			Integer multiUse, Integer lvlId, Integer overRides, Integer groups) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.valId = valId;
		this.cId = cId;
		this.multiRead = multiRead;
		this.multiUse = multiUse;
		this.lvlId = lvlId;
		this.overRides = overRides;
		this.groups = groups;
			
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getValId() {
		return valId;
	}
	public void setValId(Integer valId) {
		this.valId = valId;
	}
	public Integer getcId() {
		return cId;
	}
	public void setCId(Integer cId) {
		this.cId = cId;
	}
	public Integer getMultiRead() {
		return multiRead;
	}
	public void setMultiRead(Integer multiRead) {
		this.multiRead = multiRead;
	}
	public Integer getMultiUse() {
		return multiUse;
	}
	public void setMultiUse(Integer multiUse) {
		this.multiUse = multiUse;
	}
	public Integer getLvlId() {
		return lvlId;
	}
	public void setLvlId(Integer lvlId) {
		this.lvlId = lvlId;
	}
	public Integer getOverRides() {
		return overRides;
	}
	public void setOverRides(Integer overRides) {
		this.overRides = overRides;
	}
	public Integer getGroups() {
		return groups;
	}
	public void setGroups(Integer groups) {
		this.groups = groups;
	}
}