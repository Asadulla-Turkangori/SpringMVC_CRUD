package com.tap.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	
	@Id
	@Column(name="empid")
	int empid;
	
	@Column(name="name")
	String empname;
	
	@Column(name="jobrole")
	String jobrole;
	
	@Column(name="dept")
	String dept;
	
	@Column(name="dept_id")
	int deptid;
	
	
	

	public EmployeeEntity() {
		super();
	}
	

	public EmployeeEntity(int empid, String empname, String jobrole, String dept, int deptid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.jobrole = jobrole;
		this.dept = dept;
		this.deptid = deptid;
	}






	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	
}
