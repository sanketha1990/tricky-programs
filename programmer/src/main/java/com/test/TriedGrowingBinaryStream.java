package com.test;

public class TriedGrowingBinaryStream {
	
	static int []arr= {1,2,4,8,16,32};
			
	public static void main(String[] args) {
		int input=4;
		int result=0;
		java.util.Scanner sc1=new java.util.Scanner(System.in);
		String temp="";
		while(input>0) {
		System.out.println("Enter the input");
		String in=sc1.next();
		temp+=in;
	System.out.println("temp "+temp);
		char[] chArray=temp.toCharArray();
		for(int i=0;i<chArray.length;i++) {
			if(chArray[i] == '1') {
			result+=lookup(i);
			}
			System.out.println("result "+result);
		}
		if((result%11)==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		}
		System.out.println();
	}
	public static int lookup(int index) {
		return arr[index];
	}

}
