package com.lamda.fp.unit3;

import java.util.Arrays;
import java.util.List;

import com.lamda.fp.unit2.Person;

public class PlayingWithJava8Foreach {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person(1, "Samip", "Gowda", 20),new Person(1, "Samip", "Gowda", 20), new Person(4, "Samiksha", "Gowda", 30),
				new Person(2, "Samkruthi", "Gana", 33), new Person(5, "Chandana", "Gowdthi", 10));
		
		people.stream().forEach(Person -> {
			if (Person.getAge() < 30)
				System.out.println(Person.getAge());

		});
		
		people.forEach(Person->System.out.println(Person));
		System.out.println(" ======== Distint ========= ");
		people.stream().distinct().forEach(Person->System.out.println(Person));

		
	}

}
