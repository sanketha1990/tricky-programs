package com.lamda.fp.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestPersonJava8Lamda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "Gowda", 20), new Person("Samiksha", "Gowda", 30),
				new Person("Samkruthi", "Gana", 33), new Person("Chandana", "Gowdthi", 10));

		// 1: Sort list by firstname
		System.out.println("====================================");
		Collections.sort(people, (p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname()));

		// 2: Print list
		// people.forEach(System.out::println);
		System.out.println("====================================");
		performConditionally(people, p -> true, p -> System.out.println(p));

		// 3: Print lastname which is Gowda
		System.out.println("====================================");
		performConditionally(people, p -> p.getFirstname().startsWith("Gowda"), p -> System.out.println(p));

		// 4:Print firstname which Sam conditionally
		System.out.println("====================================");
		performConditionally(people, p -> p.getFirstname().startsWith("Sam"), p -> System.out.println(p));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
