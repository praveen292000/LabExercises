package com.abc.lab.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.lab.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        Employee emp =(Employee) context.getBean("emp");
        
        System.out.println("Employee ID: "+emp.getEmployeeId());
        System.out.println("Employee name: "+emp.getEmployeeName());
        System.out.println("Employee salary: "+emp.getSalary());
        System.out.println("Employee BU: "+emp.getBusinessUnit());
        System.out.println("Employee age: "+emp.getAge());
        
	}

}