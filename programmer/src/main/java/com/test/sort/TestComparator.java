package com.test.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(90, "Samip", 9),new Student(20, "Samip", 1), new Student(21, "Anik", 5),
				new Student(30, "Zoli", 3),
				new Student(50,"Biba",2),
				new Student(60,"Tika",8)
				);
		
	
	System.out.println("Sort by Age");
	Collections.sort(list, new SortByAge());
	list.forEach(System.out::println);
	
	System.out.println("Sort by Name");
	Collections.sort(list, new SortByName());
	list.forEach(System.out::println);

	
	System.out.println("Sort by Roll Number");
	Collections.sort(list, new SortByRollNumber());
	list.forEach(System.out::println);
	}

}
