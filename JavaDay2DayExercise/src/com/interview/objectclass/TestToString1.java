package com.interview.objectclass;
class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString() {
		return name+"..."+rollno;
	}
}
public class TestToString1 {

	public static void main(String[] args) {
		Student s1 = new Student("Chaman",101);
		Student s2 = new Student("Bharti",102);
		System.out.println(s1);//
		System.out.println(s1.toString());
		System.out.println(s2);
		//these follow below implementation if you can't implement toString()
		/*public String toString() {
			return getClass().getName()+"@"+Integer.toHexString(hashCode());
		}*/
	}
}
