package com.hackerrank;
import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long T = in.nextInt();
		if (isInRange(0, 10, T)) {
			for (long i = 0; i < T; i++) {
				long K = in.nextInt();
				if (isInRange(2, (long)Math.pow(10, 7), K)) {
					long x = K / 2;
					long y = x + K % 2;
					System.out.println(x * y);
				}
			}
		}
		in.close();
	}

	private static boolean isInRange(long min, long max, long val) {
		return (val >= min && val <= max);
	}
}
