package com.tcs.emp;

public class Emp {
	
	private Integer age;

	public Emp(Integer age) {
		super();
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [age=" + age + "]";
	}
	
	

}
