package com.hackerrank;
import java.util.HashMap;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		int strlen = input.length();
		if (isInBetween(1, 100000, strlen)) {
			HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
			for (char ch : input.toCharArray()) {
				if (charCount.containsKey(ch)) {
					charCount.put(ch, charCount.get(ch) + 1);
				} else {
					charCount.put(ch, 1);
				}
			}

			String isPalindrome = "YES";
			int oddCnt = 0;
			for (Integer chCnt : charCount.values()) {
				if (chCnt % 2 != 0) {
					oddCnt++;
				}
				if (oddCnt > 1) {
					isPalindrome = "NO";
					break;
				}
			}

			System.out.println(isPalindrome);
		}
	}

	private static boolean isInBetween(int min, int max, int num) {
		return (num >= min && num <= max);
	}
}