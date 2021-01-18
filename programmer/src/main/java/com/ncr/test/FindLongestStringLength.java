package com.ncr.test;

public class FindLongestStringLength {

	public static void main(String[] args) {
		String str="123123";
		
		/*
		 * int count=0; for(int i=0;i<str.length()-2;i++) {
		 * count=Integer.parseInt(str.substring(i,i+1))+Integer.parseInt(str.substring(i
		 * +1,i+2)); System.out.println("Count = "+count); }
		 */
		
		findCount(str);

	}
	
	public static int findCount(String str) {
		if(str == null || str.length()<=0) {
			return 0;
		}
		System.out.println(str);
		return findCount(str.substring(0,str.length()-1));
	}

}
