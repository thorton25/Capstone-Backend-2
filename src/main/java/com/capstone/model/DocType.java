package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_doctype")
public class DocType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "DOCTID")
	private Long id;
	
	@Column (name = "DOCTNAME")
	private String name;
	
	@Column (name = "DOCTDATE")
	private String date;
	
	public DocType() {
		
	}
	
	public DocType(Long id, String name, String date ) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
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
}