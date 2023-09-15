package com.basicjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empid;
	String empName;
	int salary;
	
	public Employee(int empid, String empName, int salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	
}

public class FilterMapDemo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee(101,"Aaa",10000),
				new Employee(102,"Bbb",20000),
				new Employee(103,"Cddd",50000),
				new Employee(104,"Ddd",2000)
				);
		
		List<Integer> employeeSalaryList = 	employeeList.stream().filter(e -> e.salary > 20000).map(e ->e.salary).collect(Collectors.toList());
		
		System.out.println(employeeSalaryList);
		
		
		
	}

}
