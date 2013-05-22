package com.systemsinmotion.orgchart;

import java.util.Random;

import com.systemsinmotion.orgchart.entity.Department;
import com.systemsinmotion.orgchart.entity.Employee;
import com.systemsinmotion.orgchart.entity.JobTitle;

public class Entities {

	public static final String DEPARTMENT_NAME = "Department";
	public static final Integer DEPT_ID = 22;
	public static final String EMAIL = "email";
	public static final Integer EMPLOYEE_ID = 5;
	public static final String FIRST_NAME = "first name";
	public static final String MIDDLE_INITIAL = "Z";
	public static final String JOB_TITLE = "Job Title";
	public static final Integer JOB_TITLE_ID = 5;
	public static final String JOB_TITLE_NAME = "JobTitle";
	public static final String LAST_NAME = "last name";
	public static final Integer MANAGER_ID = 1;
	public static final String SKYPE_NAME = "skype name";

	private static Random r = new Random();

	public static Department department() {
		Department department = new Department();
		department.setName(departmentName());
		return department;
	}

	public static Department department(Department parent) {
		Department department = new Department();
		department.setName(departmentName());
		department.setParentDepartment(parent);
		return department;
	}

	private static String departmentName() {
		return DEPARTMENT_NAME + r.nextInt();
	}

	public static JobTitle jobTitle() {
		JobTitle jobTitle = new JobTitle();
		jobTitle.setName(JOB_TITLE_NAME + r.nextInt());
		jobTitle.setId(JOB_TITLE_ID + r.nextInt());
		return jobTitle;
	}
	
	public static Employee employee() {
		Employee emp = new Employee();
		emp.setDepartment(department());
		emp.setFirstName(FIRST_NAME);
		emp.setLastName(LAST_NAME);
		emp.setEmail(EMAIL + r.nextInt());
		emp.setSkypeName(SKYPE_NAME + r.nextInt());
		emp.setJobTitle(jobTitle());
		emp.setId(EMPLOYEE_ID);
		emp.setMiddleInitial(MIDDLE_INITIAL);
		return emp;
	}

}
