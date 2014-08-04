package com.hackerrank;
import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		int count = 0;
		if (isInRange(1, 10, T)) {
			for (int t = 0; t < T; t++) {
				count = 0;
				String s = reader.next();
				if (isInRange(1, 10000, s.length())) {
					char[] charArr = s.toCharArray();
					int j = s.length() - 1;
					for (int i = 0; i < charArr.length / 2; i++, j--) {
						count += Math.abs((int) (charArr[i] - charArr[j]));
					}
					System.out.println(count);
				}
			}
		}
		reader.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}