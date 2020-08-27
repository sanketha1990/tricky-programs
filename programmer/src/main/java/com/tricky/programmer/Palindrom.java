package com.tricky.programmer;

public class Palindrom {

	public static void main(String[] args) {
		String str = "dfsadf";
		System.out.println(isPalindromWhile(str));
		System.out.println(isPalindromFor(str));
		System.out.println(isPalindromMiddleWhile(str));
		System.out.println(isPalindromMiddleFor(str));
	}
	// compare the elements from 0 and length-1 using while loop
	private static boolean isPalindromWhile(String str) {

		boolean isPalindrom = true;
		int j = str.length() - 1;
		int i = 0;

		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return isPalindrom = false;
			}
		}

		return isPalindrom;
	}

	// compare the elements from 0 and length-1 using while loop
	private static boolean isPalindromFor(String str) {
		boolean isPalindrom = true;
		int j = str.length() - 1;
		int i = 0;

		for (; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return isPalindrom;
	}

	// compare the elements from middle using while loop

	private static boolean isPalindromMiddleWhile(String str) {

		boolean isPalindrom = true;
		int mid = (str.length() - 1) / 2;
		int i = mid;
		int j = mid;

		for (; i != -1;) {
			if (str.charAt(i) == str.charAt(j)) {
				i--;
				j++;
			} else {
				return isPalindrom = false;
			}
		}

		return isPalindrom;
	}
	// compare the elements from middle using for loop
	private static boolean isPalindromMiddleFor(String str) {

		boolean isPalindrom = true;
		int mid = (str.length() - 1) / 2;
		int i = mid;
		int j = mid;

		while (i != -1) {
			if (str.charAt(i) == str.charAt(j)) {
				i--;
				j++;
			} else {
				return isPalindrom = false;
			}
		}

		return isPalindrom;
	}
}
