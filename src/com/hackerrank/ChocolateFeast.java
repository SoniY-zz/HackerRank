package com.hackerrank;
import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(new FileInputStream(new File("C:/Users/Yatin/Desktop/input01.txt")));
		int T = scan.nextInt();
		if (isInRange(1, 1000, T)) {
			for (int t = 0; t < T; t++) {
				int N = scan.nextInt();
				int C = scan.nextInt();
				int M = scan.nextInt();
				if (isInRange(2, 100000, N) && isInRange(1, N, C)
						&& isInRange(2, N, M)) {
					int wraps = N / C;
					int total = wraps;
					while (wraps >= M) {
						int tmp = wraps / M;
						total += tmp;
						wraps = (wraps - (tmp * M))+tmp;
					}
					System.out.println(total);
				} else {
					System.out.println("Bad Input.");
				}
			}
		} else {
			System.out.println("Bad Input.");
		}
		scan.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		// System.out.println("min :" + min + ": Max :" + max + ": val :" +
		// val);
		return (val >= min && val <= max);
	}
}
