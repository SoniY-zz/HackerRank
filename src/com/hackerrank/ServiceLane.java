package com.hackerrank;
import java.util.Scanner;

public class ServiceLane{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		if (isInRange(2, 100000, N) && isInRange(1, 1000, T)) {
			int[] width = new int[N];
			for (int i = 0; i < N; i++) {
				width[i] = scan.nextInt();
				if (!isInRange(1, 3, width[i])) {
					width[i] = 1;
				}
			}
			while (T-- > 0) {
				int i = scan.nextInt();
				int j = scan.nextInt();
				if (i >= 0 && i < j && i < N && isInRange(2, N, (j - i + 1))) {
					int k = 3;
					for (int t = i; t <= j; t++) {
						if (k > width[t]) {
							k = width[t];
						}
					}
					System.out.println(k);
				}
			}
		} else {
			System.out.println("Bad Input.");
		}
		scan.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}