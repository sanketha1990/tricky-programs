package com.test;

import java.util.Scanner;

//https://www.geeksforgeeks.org/check-divisibility-binary-stream/
public class GFGGrowingBinaryStream {

	private static Scanner sc1;

	public static void main(String[] args) {
		sc1 = new Scanner(System.in);
		int remainder=0;
		int n=11;
		while(true) {
			System.out.println("Enter the binary stream!");
			int input=sc1.nextInt();
			
			if(input == 1) {
				remainder=(remainder*2+1)%n;
			}else if(input ==0) {
				remainder=(remainder*2)%n;
			}else {
				break;
			}
			
			if(remainder%n==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
