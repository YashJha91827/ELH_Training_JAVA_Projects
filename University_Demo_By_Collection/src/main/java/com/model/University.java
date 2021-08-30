/**
 * @author Yash Jha (51955989)
 */
package com.model;

import java.util.Set;

//POJO  --  Plain Old JAVA Object
public class University {
	
	// Variables -- States
	private int universityId;
	private String universityName;
	private Set<College> colleges;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public University() {
		super();     // WWW--- Immediate Parent Class
		//System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public University(int universityId, String universityName, Set<College> colleges) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.colleges = colleges;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

}
