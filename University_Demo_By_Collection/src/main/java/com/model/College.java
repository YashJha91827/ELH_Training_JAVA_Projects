/**
 * @author Yash Jha (51955989)
 */
package com.model;

import java.util.Set;

//POJO  --  Plain Old JAVA Object
public class College {
	
	// Variables -- States
	private int collegeId;
	private String collegeName;
	private Set<Department> departments;
	
	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public College() {
		super();     // WWW--- Immediate Parent Class
		//System.out.println("This is a Default Constructor");
		
	}

	// Parameterized Constructor
	public College(int collegeId, String collegeName, Set<Department> departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

}
