package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partner_table")
public class Partner {
	
	@Id
	@Column(nullable=false,length=200)
	public int id;
	@Column(nullable=false,length=200)
	public String automobiletype;
	@Column(nullable=false,length=200)
	public int noofvehicles;
	@Column(nullable=false,length=200)
	public String email;
	@Column(nullable=false,length=200)
	public String mobilenum;
	@Column(nullable=false,length=200)
	public String city;
	@Column(nullable=false,length=200)
	public String username;
	@Column(nullable=false,length=200)
	public String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutomobiletype() {
		return automobiletype;
	}
	public void setAutomobiletype(String automobiletype) {
		this.automobiletype = automobiletype;
	}
	public int getNoofvehicles() {
		return noofvehicles;
	}
	public void setNoofvehicles(int noofvehicles) {
		this.noofvehicles = noofvehicles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Partner [id=" + id + ", automobiletype=" + automobiletype + ", noofvehicles=" + noofvehicles
				+ ", email=" + email + ", mobilenum=" + mobilenum + ", city=" + city + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	

}
