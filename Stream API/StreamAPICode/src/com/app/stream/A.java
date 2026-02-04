package com.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(
				new Student(2, "Ariz", 50000),
				new Student(1, "Arif", 63000),
				new Student(3, "Atif", 55000)
				);
		//List<Student> NewRecords = student.stream().filter(s->s.getFee()>50000).collect(Collectors.toList());
		//List<Student> NewRecords = student.stream().filter(s->s.getId()==2).collect(Collectors.toList());
		List<Student> NewRecords = student.stream().filter(s->s.getName().contains("Atif")).collect(Collectors.toList());
		for(Student s:NewRecords) {
	    	System.out.println(s.getId());
	    	System.out.println(s.getName());
	    	System.out.println(s.getFee());
	    }
		
		//****************************************************************************************
	/*	List<String> NewRecords = student.stream().map(Student::getName).collect(Collectors.toList());
		for(String s:NewRecords) {
    	System.out.println(s);	
    }
    */
		
		
	}

}
