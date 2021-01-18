package com.test.sort;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNumb()==o2.getRollNumb()) {
			return 0;
		}
		if(o1.getRollNumb() > o2.getRollNumb()) {
			return 1;
		}
		return -1;
	}
}
