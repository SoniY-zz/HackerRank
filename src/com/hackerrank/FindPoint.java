package com.hackerrank;

import java.util.Scanner;

public class FindPoint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if (isInRange(1, 15, T)) {
			for (int i = 0; i < T; i++) {
				int px = in.nextInt();
				int py = in.nextInt();
				int qx = in.nextInt();
				int qy = in.nextInt();
				if (isInRange(-100, 100, px) && isInRange(-100, 100, py)
						&& isInRange(-100, 100, qx) && isInRange(-100, 100, qy)) {
					System.out.println((2 * qx - px) + " " + (2 * qy - py));
				}
			}
		} else {
			System.out.println("Bad Input.");
		}
		in.close();

	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}

}
