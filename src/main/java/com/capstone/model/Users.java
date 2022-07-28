package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_users")
public class Users {
	
	
	@Column (name = "USERNAME")
	private String userName;
	
	@Column (name = "FirstName")
	private String firstName;
	
	@Column (name = "Last_Name")
	private String lastName;
	
	@Column (name = "Email")
	private String email;
	
	@Column (name = "Phone")
	private String phone;
	
	@Column (name = "Created")
	private String created;
	
	@Column (name = "Modified")
	private String modified;
	
	@Column (name = "ISACTIVE")
	private Integer isActive;
	
	@Column (name = "Password")
	private String password;
	
	public Users() {
		
	}
	
	public Users (String userName, String firstName, String lastName, String email,
			String phone, String created, String modified, Integer isActive, String password) {
	super();
	this.userName = userName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.created = created;
	this.modified = modified;
	this.isActive = isActive;
	this.password = password;
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public int getIsACTIVE() {
		return isActive;
	}
	public void setisActive(int isActive) {
		this.isActive = isActive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
