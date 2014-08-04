package com.hackerrank;
import java.util.HashSet;
import java.util.Scanner;

public class GemStones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (isInRange(1, 100, N)) {
			HashSet<Character> gems = new HashSet<Character>();
			HashSet<Character> rocks = new HashSet<Character>();
			for (char c = 'a'; c <= 'z'; c++) {
				gems.add(c);
			}
			for (int i = 0; i < N; i++) {
				rocks.clear();
				char[] currentRockElements = scan.next().toCharArray();
				for (int j = 0; j < currentRockElements.length; j++) {
					rocks.add(currentRockElements[j]);
				}
				gems.retainAll(rocks);
			}
			System.out.println(gems.size());
		} else {
			System.out.println("Bad input.");
		}
		scan.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}
