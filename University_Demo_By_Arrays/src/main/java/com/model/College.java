/**
 * @author Yash Jha (51955989)
 */
package com.model;

//POJO  --  Plain Old JAVA Object
public class College {
	
	// Variables -- States
	private String collegeId;
	private String collegeName;
	private Department[] departments;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public College() {
		super();     // WWW--- Immediate Parent Class
		//System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public College(String collegeId, String collegeName, Department[] departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

}
