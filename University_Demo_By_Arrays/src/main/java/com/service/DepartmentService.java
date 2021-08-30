/**
 * @author Yash Jha (51955989)
 */
package com.service;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public interface DepartmentService {
	
//Pure Abstract Method = Method Signature = No body{}	
public abstract Student searchStudentById(Department dep, int id);

public abstract Student searchStudentByName(Department department, String name);

public abstract Department searhDepartmentsByDepartmentId(College college1, String string);
public abstract College searchCollegeName(University university, String string) ;

}
