package com.tricky.programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrintNumberGretter {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(19);
		list.add(21);
		list.add(5);

		//Print number gretter than 3
		System.out.println("Print number greater than provided input");
		eval(list, n -> n >3);
		
		System.out.println("Print even number");
		eval(list, n ->n%2==0);
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }

}
