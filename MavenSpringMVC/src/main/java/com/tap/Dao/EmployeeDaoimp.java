package com.tap.Dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.tap.Entity.EmployeeEntity;


public class EmployeeDaoimp {
	
	org.hibernate.Session session;
	
	public EmployeeDaoimp() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		org.hibernate.SessionFactory sf = (org.hibernate.SessionFactory)context.getBean("session");
		session = sf.openSession();
	}
	
	
	public List<EmployeeEntity> fetchAll(){
		Query q = session.createQuery("from EmployeeEntity");
		List<EmployeeEntity> list = q.getResultList();
		return list;
	}
	
	public String Insertemp(EmployeeEntity e) {
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		return "i";
	}
	
	public int updateEmp(EmployeeEntity e) {
		Transaction t = session.beginTransaction();
		EmployeeEntity emp = session.get(EmployeeEntity.class,e.getEmpid());
		emp.setEmpname(e.getEmpname());
		emp.setJobrole(e.getJobrole());
		emp.setDept(e.getDept());
		emp.setDeptid(e.getDeptid());
		session.update(emp);
		t.commit();
		return 1;
	}
	
	public int deleteEmp(int id) {
		Transaction t = session.beginTransaction();
		EmployeeEntity e = session.get(EmployeeEntity.class, id);
		session.delete(e);
		t.commit();
		return 1;
	}
}
