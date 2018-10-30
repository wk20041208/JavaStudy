package com.java.oop.base.sort;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private String no;
	private List<Student> stus;
	private double tota;
	
	
	public ClassRoom() {
		stus = new ArrayList<>();
	}
	
	public ClassRoom(String no) {
		this();
		this.no = no;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public double getTota() {
		return tota;
	}
	public void setTota(double tota) {
		this.tota = tota;
	}
	
	

}
