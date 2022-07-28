package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_dimcategory")
public class DimCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "DIMCID")
	private Long id;
	
	@Column (name = "DIMNAME")
	private String name;
	
	@Column (name = "DIMCDATE")
	private String date;
	
	public DimCategory() {
		
	}
	
	public DimCategory(Long id, String name, String date) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
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
	public String getDimcdate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
