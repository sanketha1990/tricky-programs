package com.lamda.fp.unit1;

public class Tester {

	public static void main(String[] args) {

		String s1 = "Sank";
		String s2 = "Sank";

		Greet greet = () -> System.out.println("Print functional interface");
		greet.greeting();

		Validate val = (s3, s4) -> {
			if(s1.equals(s2)) {
				return "Same";
			}
			return "Not Same";
		};
		System.out.println(val.isSame(s1, s2));

		Runnable r = () -> {
			System.out.println("Print inside thread");
		};
		Thread t = new Thread(r);
		t.start();
	}
}
