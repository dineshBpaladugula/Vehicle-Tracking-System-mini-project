package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,length=200)
	private String name;
	@Column(nullable=false,length=200)
	private String email;
	@Column(nullable=false,length=200)
	private String gender;
	@Column(nullable=false,length=200)
	private String dateofbirth;
	@Column(nullable=false,length=200)
	private String location;
	@Column(nullable=false,length=200)
	private String username;
	@Column(nullable=false,length=200)
	private String password;
	@Column(nullable=false,length=200)
	private String contactnumber;
	@Column(name="reset_password_token")
	private String resetPasswordToken;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	public String getResetPasswordToken() {
		return resetPasswordToken;
	}
	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", dateofbirth="
				+ dateofbirth + ", location=" + location + ", username=" + username + ", password=" + password
				+ ", contactnumber=" + contactnumber + ", resetPasswordToken=" + resetPasswordToken + "]";
	}
	
}
