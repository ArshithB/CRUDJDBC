package com.crudJdbc;

public class Employee {
	
	private int id;
	private String name;
	private String city;
	private String state;
	private int pincode;
	public Employee(int id, String name, String city, String state, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Employee() {
		super();
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
	
	

}
