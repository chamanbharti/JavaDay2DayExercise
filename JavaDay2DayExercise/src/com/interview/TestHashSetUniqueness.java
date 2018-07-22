package com.interview;

import java.util.HashSet;
import java.util.Objects;

class Student{
	int roll;
	String name;
	float salary;
	
	public Student(int roll, String name,float salary) {
		this.roll=roll;
		this.name=name;
		this.salary=salary;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o == this) {
			return true;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		if(!(o instanceof Student)) {
			return false;
		}
		Student s=(Student)o;
		//step I
		//return this.getRoll() == s.getRoll();//for single variable
		//step II
		//return this.name.equals(s.name) && this.roll == s.roll && this.salary == s.salary;
		
		//step III using jdk7's Objects class
		return this.roll==s.roll && this.salary== s.salary && Objects.equals(this.getName(), s.getName());
	}
	
	public int hashCode() {
		
		//step I
		/*final int prime=31;
		int result=1;
		result = prime*result+getRoll();
		return result;*/
		
		//step II
		/*final int prime=31;
		int result=1;
		result = prime*result+getRoll();
		result = prime*result+getName().hashCode();
		result = (int) ((int)prime*result+getSalary());
		
		return result;*/
		
		//step III using jdk7's Objects class
		return Objects.hash(roll,name,salary);
		
	}
	
}
public class TestHashSetUniqueness {

	public static void main(String[] args) {

		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Chaman Bharti",25000));
		hs.add(new Student(1,"Chaman Bharti",25000));
		
		System.out.println(hs.size());//2

	}

}
