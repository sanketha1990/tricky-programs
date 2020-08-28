package com.tricky.programmer;

public class IntegerToRomanNumeral {
	public static void main(String[] args) {
		System.out.println("Converted Roman numeral is = "+convertIntegerToRomanNumeral(666));
	}

	private static String convertIntegerToRomanNumeral(int number) {
		String[] units = {"","I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX" };
		String[] tens = { "", "X", "XX", "XXX", "XL","L", "LX", "LXX", "LXX", "XC" };
		String[] hundreds = { "", "C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "DM" };
		String[] thousends = { "", "M", "MM", "MMM" };

		return thousends[number/1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10]
				+ units[(number % 10)];
	}
}