/**
 * @author Yash Jha (51955989)
 */
package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.exception.MyException;
import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmantService;
import com.service.DepartmentServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		
		int idNo = scan.nextInt();
		Student student1 = new Student(11, "Yash Jha", 25);
		Student student2 = new Student(12, "Swati Randhawa", 24);
		Student student3 = new Student(13, "Roshni Balakrishnan Iyer", 24);
		Student student4 = new Student(14, "Neha Mittal", 27);
		Student student5 = new Student(15, "Maya Sharma", 26);

		Student student6 = new Student(16, "Gaurav Gotwal", 28);
		Student student7 = new Student(17, "Anirudh Sharma", 27);
		Student student8 = new Student(18, "Sonia Mankani", 24);
		Student student9 = new Student(19, "Jason Daniel", 22);
		Student student10 = new Student(20, "G Revathi", 23);

		Student student11 = new Student(21, "Sanjay Gaur", 22);
		Student student12 = new Student(22, "Kaveri Sood", 26);
		Student student13 = new Student(23, "Divya Pareek", 28);
		Student student14 = new Student(24, "Monika Mathur", 21);
		Student student15 = new Student(25, "Umang Jain", 26);

		Student student16 = new Student(26, "Parul Bhatt", 22);
		Student student17 = new Student(27, "Amrita Reddy", 23);
		Student student18 = new Student(28, "Shivangi Sajnani", 22);
		Student student19 = new Student(29, "Chaniket Bharadwaj", 25);
		Student student20 = new Student(30, "Mayank Verma", 26);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		students.add(student11);
		students.add(student12);
		students.add(student13);
		students.add(student14);
		students.add(student15);
		students.add(student16);
		students.add(student17);
		students.add(student18);
		students.add(student19);
		students.add(student20);

		Department department1 = new Department(101, "CSE Branch", students);
		Department department2 = new Department(102, "IT Branch", students);
		Department department3 = new Department(201, "MECHANICAL Branch", students);
		Department department4 = new Department(202, "CIVIL Branch", students);
		
		Set<Department> departments = new HashSet<>();
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		departments.add(department4);
		Department department = new Department();
		department.setStudents(students);

		College college1 = new College(1001, "JECRC Foundation", departments);
		College college2 = new College(1002, "BITS Pilani", departments);
		
		Set<College> colleges = new HashSet<>();
		colleges.add(college1);
		colleges.add(college2);
		College college = new College();
		college.setDepartments(departments);

		University university = new University(1234, "RTU (Rajasthan Technical University)", colleges);
		university.setColleges(colleges);

		DepartmantService departmentService = new DepartmentServiceImpl();
		//Student Info = null;
		try {
			Student info = departmentService.searchStudent(department, idNo);

			if (info != null) {

				if (info.getStudentId() >= 11 && info.getStudentId() <= 15) {
					System.out.println("University ID is : " + university.getUniversityId());
					System.out.println("University Name is : " + university.getUniversityName());
					System.out.println("College ID is : " + college1.getCollegeId());
					System.out.println("College Name is : " + college1.getCollegeName());
					System.out.println("Department ID is : " + department1.getDepartmentId());
					System.out.println("Department Name is : " + department1.getDepartmentName());
					System.out.println("The ID Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());

				}

				else if (info.getStudentId() >= 16 && info.getStudentId() <= 20) {
					System.out.println("University ID is : " + university.getUniversityId());
					System.out.println("University Name is : " + university.getUniversityName());
					System.out.println("College ID is : " + college1.getCollegeId());
					System.out.println("College Name is : " + college1.getCollegeName());
					System.out.println("Department ID is : " + department2.getDepartmentId());
					System.out.println("Department Name is : " + department2.getDepartmentName());
					System.out.println("The ID Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
					
				} 
				
				else if (info.getStudentId() >= 21 && info.getStudentId() <= 25) {
					System.out.println("University ID is : " + university.getUniversityId());
					System.out.println("University Name is : " + university.getUniversityName());
					System.out.println("College ID is : " + college2.getCollegeId());
					System.out.println("College Name is : " + college2.getCollegeName());
					System.out.println("Department ID is : " + department3.getDepartmentId());
					System.out.println("Department Name is : " + department3.getDepartmentName());
					System.out.println("The ID Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
					
				} 
				
				else if (info.getStudentId() >= 26 && info.getStudentId() <= 30) {
					System.out.println("University ID is : " + university.getUniversityId());
					System.out.println("University Name is : " + university.getUniversityName());
					System.out.println("College ID is : " + college2.getCollegeId());
					System.out.println("College Name is : " + college2.getCollegeName());
					System.out.println("Department ID is : " + department3.getDepartmentId());
					System.out.println("Department Name is : " + department3.getDepartmentName());
					System.out.println("The ID Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				}
				
			}
			
//			else
//			{
//				System.err.println("No Data Found");
//			}
			
		} 
		catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
