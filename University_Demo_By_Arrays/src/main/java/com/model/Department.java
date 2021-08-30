/**
 * @author Yash Jha (51955989)
 */
package com.model;

//POJO  --  Plain Old JAVA Object
public class Department {
	
	// Variables -- States
	private int deptId;
	private String deptName;
	private Student[] student;

	// Methods -- Behaviors

	// Non-Parameterized Constructor
	public Department() {
		super();   // WWW--- Immediate Parent Class
		//System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public Department(int deptId, String deptName, Student[] student) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
	}
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

}
