package com.hibernate.vehicle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {
// this is new commit
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "make")
	private String make;

	@Column(name = "model")
	private String model;

	@Column(name = "color")
	private String color;

	@Column(name = "licanse")
	private String licanse;

	@Column(name = "year")
	private String vyear;

	@Column(name = "class")
	private String vclass;

	@Column(name = "vin")
	private String vinNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String modle) {
		this.model = modle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicanse() {
		return licanse;
	}

	public void setLicanse(String licanse) {
		this.licanse = licanse;
	}

	public String getVyear() {
		return vyear;
	}

	public void setVyear(String vyear) {
		this.vyear = vyear;
	}

	public String getVclass() {
		return vclass;
	}

	public void setVclass(String vclass) {
		this.vclass = vclass;
	}

	public String getVinNo() {
		return vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	@Override
	public String toString() {
		return "VehicleEntity [id=" + id + ", make=" + make + ", modle=" + model + ", color=" + color + ", licanse="
				+ licanse + ", vyear=" + vyear + ", vclass=" + vclass + ", vinNo=" + vinNo + "]";
	}
	

}
