package com.wolken.butterflys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "butterfly_details")
public class ButterFlyDTO {

	@Id
    @Column(name = "id")
    private int id;
    @Column(name = "butterflyname")
    private String butterflyname;
    @Column(name = "wings")
    private int wings;
    @Column(name = "wingsColor")
    private String wingsColor;
    @Column(name = "age")
    private int age;
    @Column(name = "legs")
    private int legs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getButterflyname() {
		return butterflyname;
	}
	public void setButterflyname(String butterflyname) {
		this.butterflyname = butterflyname;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public String getWingsColor() {
		return wingsColor;
	}
	public void setWingsColor(String wingsColor) {
		this.wingsColor = wingsColor;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "ButterFlyDTO [id=" + id + ", butterflyname=" + butterflyname + ", wings=" + wings + ", wingsColor="
				+ wingsColor + ", age=" + age + ", legs=" + legs + "]";
	}
    
	
	
}
