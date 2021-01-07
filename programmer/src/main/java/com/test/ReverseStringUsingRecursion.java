package com.test;

public class ReverseStringUsingRecursion {

	static String temp;
	public static void main(String[] args) {
		
		String str="GeeksForGeeks";
		reverseString(str);
	}
	
	public static String reverseString(String str) {
		if(str == null || str.length()<=1) {
			System.out.println(temp);
			return null;
		}
		System.out.print(str.charAt(str.length()-1));
		return reverseString(str.substring(0,str.length()-1));
		
	}

}
