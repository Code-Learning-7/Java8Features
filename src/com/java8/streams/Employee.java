package com.java8.streams;

public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private String countrty;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, double salary, String countrty) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.countrty = countrty;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountrty() {
		return countrty;
	}
	public void setCountrty(String countrty) {
		this.countrty = countrty;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", countrty="
				+ countrty + "]";
	}
	
}
