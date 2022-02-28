package com.java8.streams.collectors;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private long leaves;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, double salary, long leaves) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.leaves = leaves;
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
	public long getLeaves() {
		return leaves;
	}
	public void setLeaves(long leaves) {
		this.leaves = leaves;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", leaves=" + leaves + "]";
	}	
	
}
