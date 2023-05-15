package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_table")
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,length=200)
	private String vehiclenumber;
	@Column(nullable=false,length=200)
	private String vehicletype;
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehiclenumber=" + vehiclenumber + ", vehicletype=" + vehicletype + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
}
