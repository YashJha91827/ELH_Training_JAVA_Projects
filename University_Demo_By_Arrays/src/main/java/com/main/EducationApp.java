/**
 * @author Yash Jha (51955989)
 */
package com.main;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmentService;
import com.service.DepartmentServiceImpl;

public class EducationApp {
	public static void main(String[] args) {
		Student student1 = new Student(50, "Yash Jha", 26);
		Student student2 = new Student(60, "Swati Randhawa", 25);
		Student student3 = new Student(20, "Neha Mittal", 27);
		Student student4 = new Student(11, "Roshni Balakrishnan Iyer", 24);
		Student student5 = new Student(12, "Maya Sharma", 26);

		Department department = new Department();
		department.setDeptId(100);
		department.setDeptName("B.Tech");
		Department dep = new Department();
		dep.setDeptId(101);
		dep.setDeptName("M.Tech");

		College college1 = new College();
		college1.setCollegeId("R9876");
		college1.setCollegeName("JECRC Foundation");

		College college2 = new College();
		college2.setCollegeId("J6789");
		college2.setCollegeName("BITS Pilani");
		College[] college = new College[2];
		college[0] = college1;
		college[1] = college2;
		Department[] departments = new Department[2];
		departments[0] = department;
		departments[1] = dep;
		college1.setDepartments(departments);
		student1.setDepartment(department);
		student2.setDepartment(dep);
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		department.setStudent(students);
		Student[] batch2 = new Student[2];
		batch2[0] = student4;
		batch2[1] = student5;
		dep.setStudent(batch2);
		University university = new University();
		university.setUniversityCode(122);
		university.setUniversityName("RTU");
		university.setColleges(college);

		DepartmentService departmentService = new DepartmentServiceImpl();

		Student student = departmentService.searchStudentById(department, 60);
		// Student[] student = departmentService.searchStudentById(departments, 60);

		Department departmentObj = departmentService.searhDepartmentsByDepartmentId(college1, "R9876");
		College collegeresult = departmentService.searchCollegeName(university, "JECRC Foundation");

		if (departmentObj != null) {
			System.out.println("College Name : " + college1.getCollegeName());
			System.out.println("College ID : " + college1.getCollegeId());

			for (int i = 0; i < college1.getDepartments().length; i++) {

				System.out.println("Department ID : " + departments[i].getDeptId());
				System.out.println("Department Name : " + departments[i].getDeptName());

			}
			System.out.println();
		}

		Student batch = departmentService.searchStudentById(dep, 12);
		if (batch != null) {
			System.out.println("Student ID : " + batch.getStudId());
			System.out.println("Student Name : " + batch.getStudName());
			System.out.println("student Age : " + batch.getStudAge());
			System.out.println("Student Department ID : " + dep.getDeptId());
			System.out.println("Student Department Name : " + dep.getDeptName());
			System.out.println("Student College Name : " + college1.getCollegeName());
			if (collegeresult != null) {
				System.out.println("Student University Name : " + university.getUniversityName());
			}
			System.out.println();
		}
		if (student != null) {
			System.out.println("Student ID : " + student.getStudId());
			System.out.println("Student Name : " + student.getStudName());
			System.out.println("Student Age : " + student.getStudAge());
			System.out.println("Student Department ID : " + department.getDeptId());
			System.out.println("Student Department Name :" + department.getDeptName());
			System.out.println("Student College Name : " + college2.getCollegeName());
			System.out.println("Student University Name : " + university.getUniversityName());
		}
		System.out.println();
		Student studentObj = departmentService.searchStudentByName(department, "Yash Jha");
		if (studentObj != null) {
			System.out.println("Student ID : " + studentObj.getStudId());
			System.out.println("Student Name : " + studentObj.getStudName());
			System.out.println("Student Age : " + studentObj.getStudAge());
			System.out.println("Student Department ID : " + department.getDeptId());
			System.out.println("Student Department Name : " + department.getDeptName());
			System.out.println("Student College Name : " + college2.getCollegeName());
			System.out.println("Student University Name : " + university.getUniversityName());
		}

	}

}