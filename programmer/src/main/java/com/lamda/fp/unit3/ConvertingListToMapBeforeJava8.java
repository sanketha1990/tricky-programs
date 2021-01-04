package com.lamda.fp.unit3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lamda.fp.unit2.Person;

public class ConvertingListToMapBeforeJava8 {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		List<Person> people = Arrays.asList(new Person(1, "Samip", "Gowda", 20), new Person(4, "Samiksha", "Gowda", 30),
				new Person(2, "Samkruthi", "Gana", 33), new Person(5, "Chandana", "Gowdthi", 10));

		for (Person p : people) {
			map.put(p.getPersonId(), p);
		}
		System.out.println(map);

		map = people.stream().collect(Collectors.toMap(Person::getPersonId, person -> person));
		System.out.println("List to Map using java8 = " + map);
	}
}
