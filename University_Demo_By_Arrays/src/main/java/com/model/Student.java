/**
 * @author Yash Jha (51955989)
 */
package com.model;

//POJO  --  Plain Old JAVA Object
public class Student {
	
	// Variables -- States
	private int studId;
	private String studName;
	private int studAge;
	private Department department;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public Student() {
		super();    // WWW--- Immediate Parent Class
		//System.ou.println("This is a Default Constructor");
	}
   
	// Parameterized Constructor
	public Student(int studId, String studName, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStuName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
