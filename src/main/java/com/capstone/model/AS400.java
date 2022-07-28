package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_as400")
public class AS400 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "AS400ID")
	private Integer as400Id;
	
	@Column (name = "AS400NAME")
	private String as400Name;
	
	public AS400() {
		
	}
	
	public AS400(Integer as400Id, String as400Name) {
		super();
		this.as400Id = as400Id;
		this.as400Name = as400Name;
	}

	public Integer getAs400Id() {
		return as400Id;
	}

	public void setAs400Id(Integer as400Id) {
		this.as400Id = as400Id;
	}

	public String getAs400Name() {
		return as400Name;
	}

	public void setAs400Name(String as400Name) {
		this.as400Name = as400Name;
	}
	
}
