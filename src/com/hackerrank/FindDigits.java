package com.hackerrank;
import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int T = console.nextInt();
		if (isInRange(1, 15, T)) {
			for (int i = 0; i < T; i++) {
				String N = console.next();
				long num = Long.parseLong(N);
				if (isInRange(1, 999999999, num)) {
					char[] nums = N.toCharArray();
					int cnt = 0;
					for (char c : nums) {
						int value = Character.getNumericValue(c);
						if (value > 0 && num % value == 0) {
							cnt++;
						}
					}
					System.out.println(cnt);
				}
			}
		}
		console.close();
	}

	private static boolean isInRange(long min, long max, long val) {
		return (val >= min && val <= max);
	}
}
