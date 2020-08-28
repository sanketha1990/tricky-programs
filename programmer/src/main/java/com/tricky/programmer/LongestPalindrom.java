package com.tricky.programmer;

public class LongestPalindrom {
	static int resultStart = 0;
	static int resultLength = 0;

	public static void main(String[] args) {
		String str = "madamabcdcbnaman";
		String longest = solution(str);
		System.out.println("Longest = " + longest);

	}

	private static String solution(String str) {

		int length = str.length();

		if (length <= 2) {
			return str;
		}

		for (int start = 0; start < str.length(); start++) {
			expandRange(str, start, start);
			expandRange(str, start, start + 1);
		}
		return str.substring(resultStart, resultStart + resultLength);

	}

	public static void expandRange(String str, int begin, int end) {

		while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}

		if (resultLength < end - begin) {
			resultStart = begin + 1;
			resultLength = end - begin - 1;
		}
	}

}
