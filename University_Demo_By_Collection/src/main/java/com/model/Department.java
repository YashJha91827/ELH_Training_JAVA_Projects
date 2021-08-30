/**
 * @author Yash Jha (51955989)
 */
package com.model;

import java.util.List;

//POJO  --  Plain Old JAVA Object
public class Department {
	
	// Variables -- States
	private int departmentId;
	private String departmentName;
	private List<Student> students;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public Department() {
		super();     // WWW--- Immediate Parent Class
		//System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public Department(int departmentId, String departmentName, List<Student> students) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.students = students;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
