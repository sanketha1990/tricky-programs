package com.tricky.programmer;

import java.util.List;

import com.java.brain.lamda.util.Person;
import com.java.brain.lamda.util.RandomDataGenerator;

public class lamda1 {
	
	public static void main(String[] args) {
		List<Person> people = RandomDataGenerator.generatePersonData(1000);
		
		System.out.println(people);
		people.stream().filter(p->p.getFirstName().startsWith("Noah")).filter(p->p.getCity().equals("Patterson")).forEach(p->System.out.println(p));
		
	}
	
	

}
