package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_dim")
public class Dim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "DIMID")
	private Long dimId;
	
	@Column (name = "DIMTID")
	private Integer dimTId;
	
	@Column (name = "DIMVALUE")
	private String value;
	
	@Column (name = "DIMDATE")
	private String date;
	
//	@Column (name = "DIMUSE")
//	private String use;
	
	public Dim() {
		
	}

public Dim(Long dimId, Integer dimTId, String value, String date) {
	super();
	this.dimId = dimId;
	this.dimTId = dimTId;
	this.value = value;
	this.date = date;
}

public Long getDimId() {
	return dimId;
}

public void setDimId(Long dimId) {
	this.dimId = dimId;
}

public Integer getDimTId() {
	return dimTId;
}

public void setDimTId(Integer dimTId) {
	this.dimTId = dimTId;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}



//	}
//	//public String getUse() {
//	//	return use;
//	}
//	public void setUse(String use) {
//		this.use = use;
//	}
}
