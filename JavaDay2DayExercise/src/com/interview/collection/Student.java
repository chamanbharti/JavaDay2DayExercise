package com.interview.collection;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	@Override
	public int compareTo(Student s) {
		//by name
		//return this.getName().compareTo(s.getName());
		
     /*		
      //by id
		if(this.getId() == s.getId()) {
			return 0;
		}
		else if(this.getId() > s.getId()) {
			return 1;
		}
		else {
			return -1;
		}*/
		
		//by age
		if(this.getAge() == s.getAge()) {
			return 0;
		}
		else if(this.getAge() > s.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
}
