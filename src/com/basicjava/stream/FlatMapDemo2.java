package com.basicjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String sname;
	int sid;
	char grade;
	
	public Student(String sname, int sid, char grade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
	
}
public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student("A1Name",101,'A'));
		studentList1.add(new Student("A2Name",203,'C'));
		studentList1.add(new Student("A3Name",302,'B'));
		
		List<Student> studentList2 = new ArrayList<>();
		studentList1.add(new Student("B1Name",201,'C'));
		studentList1.add(new Student("B2Name",303,'B'));
		studentList1.add(new Student("B3Name",102,'A'));
		
		List<Student> studentList3 = new ArrayList<>();
		studentList1.add(new Student("C1Name",301,'B'));
		studentList1.add(new Student("C2Name",103,'A'));
		studentList1.add(new Student("C3Name",202,'C'));
		
		List<List<Student>> studList = Arrays.asList(studentList1,studentList2,studentList3);
		
		List<String> result =  studList.stream().flatMap(x-> x.stream()).map(s->s.sname).collect(Collectors.toList());
		System.out.println(result);
	}

}
