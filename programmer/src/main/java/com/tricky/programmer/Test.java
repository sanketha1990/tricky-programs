package com.tricky.programmer;

public class Test {
	
	public static void main(String[] args) {
		//#1
		float f=12.0f;
		double d=f++;
		long l=12;
		d--;
		d-=0.3;
		System.out.print((f==d)+" ");
		System.out.print(d==l);
		System.out.println();
		//#2
		StringBuilder sb=new StringBuilder("DoSelect");
		sb.append(new char[] {'l','a','b'},0,2);
		System.out.println(sb);
	}

}
