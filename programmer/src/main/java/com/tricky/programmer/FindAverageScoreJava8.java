package com.tricky.programmer;

import java.util.*;
import java.util.stream.IntStream;
public class FindAverageScoreJava8 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(30,45,50,70,90);

		OptionalDouble avegMarks=list.stream().mapToInt(number -> number.intValue()).average();
		System.out.println("Average marks List = "+avegMarks);
		
		
		int[] arr = new int[10];
		 
        arr[0] = 20;
        arr[1] = 50;
        arr[2] = 99;
        arr[3] = 12;
        arr[4] = 94;
        arr[5] = 22;
        arr[6] = 43;
        arr[7] = 56;
        arr[8] = 55;
        arr[9] = 78;
        
        IntStream instream=Arrays.stream(arr);
        OptionalDouble optDouble=instream.average();
        
        System.out.print("Averge score by Array "+optDouble);
        
	}

}
