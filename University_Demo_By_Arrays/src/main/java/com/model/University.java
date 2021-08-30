/**
 * @author Yash Jha (51955989)
 */
package com.model;

//POJO  --  Plain Old JAVA Object
public class University {

	// Variables -- States
	private int universityCode;
	private String universityName;
	private College[] colleges;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public University() {
		super();    // WWW--- Immediate Parent Class
		//System.ou.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public University(int universityCode, String universityName, College[] colleges) {
		super();
		this.universityCode = universityCode;
		this.universityName = universityName;
		this.colleges = colleges;
	}

	public int getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(int universityCode) {
		this.universityCode = universityCode;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public College[] getColleges() {
		return colleges;
	}

	public void setColleges(College[] colleges) {
		this.colleges = colleges;

	}
}