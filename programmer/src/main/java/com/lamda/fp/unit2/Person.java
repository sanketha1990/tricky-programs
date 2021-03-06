package com.lamda.fp.unit2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private int personId;
	private String firstname;
	private String lastname;
	private int age;
}
