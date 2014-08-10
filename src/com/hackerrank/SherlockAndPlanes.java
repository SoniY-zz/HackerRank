package com.hackerrank;

import java.util.Scanner;

public class SherlockAndPlanes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if (isInRange(1, 10000, T)) {
			for (int i = 0; i < T; i++) {
				int rows = 4;
				int columns = 3;
				int[][] cords = new int[rows][columns];

				for (int j = 0; j < rows; j++) {
					for (int k = 0; k < columns; k++) {
						cords[j][k] = in.nextInt();
					}
				}

				int a = (cords[1][1] - cords[0][1])
						* (cords[2][2] - cords[0][2]);
				int b = -1 * (cords[1][2] - cords[0][2])
						* (cords[2][0] - cords[0][0]);
				int c = (cords[1][0] - cords[0][0])
						* (cords[2][1] - cords[0][1]);
				int d = (a * cords[0][0]) + (b * cords[0][1])
						+ (c * cords[0][2]);
				int dd = (a * cords[3][0]) + (b * cords[3][1])
						+ (c * cords[3][2]);

				/*
				 * ax+by+cz+d = 0 
				 * cords[0][0] cords[0][1] cords[0][2]
				 * cords[1][0] cords[1][1] cords[1][2]
				 * cords[2][0] cords[2][1] cords[2][2] 
				 * cords[3][0] cords[3][1] cords[3][2]
				 */
				if (d == dd)
					System.out.println("YES");
				else
					System.out.println("NO");
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
