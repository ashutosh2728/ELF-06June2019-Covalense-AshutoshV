package com.covalense.javaapp.assgn.collections;

public class StudentA {
	private String name;
	private int id;
	private double percentage;
	
	/*
	 * public StudentA(int id) { this.id=id; this.name=name;
	 * this.percentage=percentage; }
	 */
	
	@Override
	public String toString() {
		return "StudentA [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
