package com.tricky.programmer;

public class ReverseString {

	public static void main(String[] args) {
	
		String str = "Tricky";
		reverseUsingSB(str);
		reveseManually(str);
	}

	private static void reverseUsingSB(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}

	private static void reveseManually(String str) {

		StringBuilder sb = new StringBuilder();
		// String rev = "";
		for (int i = str.length() - 1; i != -1; i--) {
			// rev = rev + str.charAt(i);
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
