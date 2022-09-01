package com.Q3;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}
	
	@Override
	public int compareTo(Student o) {
		
		Student s1= this;
		Student s2 = (Student)o;
		
		int totalMarks1 = s2.getEngMarks()+ s2.getMathsMarks()+ s2.getScienceMarks();
		int totalMarks2 = s1.engMarks + s1.mathsMarks + s1.scienceMarks ;
		if(totalMarks2 > totalMarks1) {
			return +1;
		}
		else if(totalMarks2 < totalMarks1) {
			return -1;
		}
	
		return s2.getName().compareTo(s1.getName());
	}
	
	
	
	
	@Override
	public String toString() {
		return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		/*
You have to sort the collection of students on the basis of the total Marks,
If the totalMarks are equal then you have to sort on the basis of Name and
if names are the same then sort on the basis of the rollNo.

		 */
	
		Set<Student> ts = new TreeSet<>();
		
		ts.add(new Student (1,"name1",45,65,23));
		ts.add(new Student (2,"name2",75,65,23));
		ts.add(new Student (5,"name5",45,85,23));
		ts.add(new Student (4,"name3",45,35,23));
		ts.add(new Student (3,"name4",45,65,23));
		ts.add(new Student (6,"name5",45,65,23));
		
		//System.out.println(ts.size());
		
		System.out.println(ts);
		
	}
	
	
	
}

















