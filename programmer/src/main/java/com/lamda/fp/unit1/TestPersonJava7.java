package com.lamda.fp.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestPersonJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Samip", "Gowda", 20), new Person("Samiksha", "Gowda", 30),
				new Person("Samkruthi", "Gana", 33), new Person("Chandana", "Gowdthi", 10));

		people.forEach(System.out::println);

		// 1: Sort list by firstname
		System.out.println("======= Sort by firstname =====");
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstname().compareTo(o2.getFirstname());
			}

		});

		// 2: Print list
		System.out.println("===== Print all ========");
		printPeople(people,p->true);

		// 3: Print lastname which is Gowda
		System.out.println("==== Print Firstname Gowda =========");
		printPeople(people,new Conditional() {

			@Override
			public boolean test(Person o) {
				// TODO Auto-generated method stub
				return o.getFirstname().startsWith("Gowda");
			}
		});
		
		
		//4:Print firstname conditionally
		System.out.println(" ====== Print lastname Sam conditionally ======== ");
		printPeople(people,new Conditional() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastname().startsWith("Sam");
			}
		});
		
	}

	private static void printPeople(List<Person> people,Conditional cond) {
		for (Person p : people) {
			if (cond.test(p)) {
				System.out.println(p);
			}
		}

	}

	public interface Conditional {
		public boolean test(Person p);
	}

}
