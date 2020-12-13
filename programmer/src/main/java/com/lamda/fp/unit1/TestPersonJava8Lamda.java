package com.lamda.fp.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPersonJava8Lamda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "Gowda", 20), new Person("Samiksha", "Gowda", 30),
				new Person("Samkruthi", "Gana", 33), new Person("Chandana", "Gowdthi", 10));

		// 1: Sort list by firstname
		Collections.sort(people, (p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname()));

		// 2: Print list
		//people.forEach(System.out::println);
		printConditionally(people, p->true);

		// 3: Print lastname which is Gowda
		printConditionally(people,p->p.getFirstname().startsWith("Gowda"));

		// 4:Print firstname which Sam conditionally
		printConditionally(people, p->p.getFirstname().startsWith("Sam"));
	}

	private static void printConditionally(List<Person> people, Conditional cond) {
		for (Person p : people) {
			if (cond.test(p)) {
				System.out.println(p);
			}
		}

	}

}

interface Conditional {
	public boolean test(Person p);
}
