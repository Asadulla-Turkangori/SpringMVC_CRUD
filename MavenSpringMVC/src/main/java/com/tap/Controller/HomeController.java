package com.tap.Controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tap.Dao.EmployeeDaoimp;
import com.tap.Entity.EmployeeEntity;


@Controller
public class HomeController {
	
	EmployeeDaoimp empdao;
	
	public HomeController() {
		this.empdao = new EmployeeDaoimp();
	}
	
	
	@RequestMapping("/")
	public String firstCall(HttpServletRequest req) {
		List<EmployeeEntity> list = empdao.fetchAll();
		req.setAttribute("emplist", list);
		return "index";
	}

	@RequestMapping("formfilled")
	public String SecondCall(@RequestParam("empid") int empid,@RequestParam("name") String name,@RequestParam("jobrole") String jobrole,@RequestParam("dept") String dept,@RequestParam("deptid") int deptid) {
		EmployeeEntity emp = new EmployeeEntity(empid,name,jobrole,dept,deptid);
		String str = empdao.Insertemp(emp);
		return "redirect:/";
	}
	
	@RequestMapping("insertform")
	public String insertcall() {
		return "Home";	
	}
	
	@RequestMapping("updateemp")
	public String updatecall() {
		return "editform";	
	}
	
	@RequestMapping("updateform")
	public String updateform(@RequestParam("empid") int empid,@RequestParam("name") String name,@RequestParam("jobrole") String jobrole,@RequestParam("dept") String dept,@RequestParam("deptid") int deptid) {
		EmployeeEntity emp = new EmployeeEntity(empid,name,jobrole,dept,deptid);
		empdao.updateEmp(emp);
		return "redirect:/";
	}
	
	@RequestMapping("deleteemp")
	public String deleteEmp(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("empid"));
		empdao.deleteEmp(id);
		return "redirect:/";
	}
}
