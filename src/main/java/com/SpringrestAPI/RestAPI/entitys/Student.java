package com.SpringrestAPI.RestAPI.entitys;

public class Student {
	private int id;
	private String firstbame;
	private String lastname;
	private int age;
	
	public Student(int id, String firstbame, String lastname, int age) {
		super();
		this.id = id;
		this.firstbame = firstbame;
		this.lastname = lastname;
		this.age = age;
	}

	
	public Student() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstbame() {
		return firstbame;
	}
	public void setFirstbame(String firstbame) {
		this.firstbame = firstbame;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstbame=" + firstbame + ", lastname=" + lastname + ", age=" + age + "]";
	}
	

}
