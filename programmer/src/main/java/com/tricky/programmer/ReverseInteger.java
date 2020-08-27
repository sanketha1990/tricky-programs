package com.tricky.programmer;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 54321;
		int reverserd = 0;

		while (input != 0) {
			reverserd = reverserd * 10 + input % 10;
			input /= 10;
		}
		System.out.println(reverserd);
	}

}
