package com.entity;

public class Employee {

	private int id;
	private String name;
	private String salary;
	private Country con;
	public Employee() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String salary, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.con = con;
	}
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Country getCon() {
		return con;
	}
	public void setCon(Country con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", con=" + con + "]";
	}
	
	
}
