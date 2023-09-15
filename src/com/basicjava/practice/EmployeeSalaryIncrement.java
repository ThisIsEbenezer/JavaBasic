package com.basicjava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
     String empName;
     int empAge;
     double empSalary;

    public Employee(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}

public class EmployeeSalaryIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Employee> employees =Arrays.asList(
	            new Employee("John", 30, 50000.0),
	            new Employee("Alice", 22, 45000.0),
	            new Employee("Bob", 28, 60000.0)
	        );
			//System.out.println(employees);
			
			
			List<Employee> updatedEmployees =	employees.stream().map( emp-> {
						if( emp.getEmpAge() > 25) {
							double updateEmpSalary = emp.getEmpSalary() * 1.05;
							emp.setEmpSalary(updateEmpSalary);
						}
						return emp;
					}).collect(Collectors.toList());
			
			updatedEmployees.forEach(e-> System.out.println(
					" Name="+ e.getEmpName() +
					" Age="+ e.getEmpAge() + 
					" Salary="+ e.getEmpSalary()
					));
			

	}

}
