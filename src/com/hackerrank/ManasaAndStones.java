package com.hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int testCases = console.nextInt();
		if (isInRange(1, 10, testCases)) {
			for (int i = 0; i < testCases; i++) {
				int len = console.nextInt();
				int diffA = console.nextInt();
				int diffB = console.nextInt();
				if (isInRange(1, 1000, len) && isInRange(1, 1000, diffA)
						&& isInRange(1, 1000, diffB)) {
					ArrayList<Integer> result = new ArrayList<Integer>();
					for (int j = 0; j < len; j++) {
						int tmp = diffA * j + diffB * (len - j - 1);
						if (!result.contains(tmp)) {
							result.add(tmp);
						}
					}
					Collections.sort(result);
					for (Integer integer : result) {
						System.out.print(integer + " ");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("Bad Input.");
		}
		console.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}
