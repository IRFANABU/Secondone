package com.example.basic;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping

@RestController
public class Add {
	private static final String name = null;

	@GetMapping(value="/addof/{a}/{b}")
		public int add(@PathVariable int a,@PathVariable int b) {
		if (a>b) {
		return a;
		}
		else {	
		return b;
	}
}
	
	@GetMapping(value="/str/{name}")
		public String check(@PathVariable String name ) {
		if(name.equals("hello")) {
			
			return "IS asame ";
		}
		else {
			
			return "Different";
		}
	}
	@GetMapping(value="/getEmployee")
	public Employee getemployee(@RequestBody Employee e){
		return e;
		
	
	}

	@GetMapping(value="/GetEmlys")
	public List<Employee>getEmp(@RequestBody List<Employee>emp){
		for(Employee c:emp) {
			if(c.getSalary1()>10000) {
				c.setSalary(c.getSalary1()+5000);
			}
		}
		return emp;
	}
}
	

