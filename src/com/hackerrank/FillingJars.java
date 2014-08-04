package com.hackerrank;
import java.util.Scanner;

/*
 3 <= N <= 107 
 1 <= M <= 105 
 1 <= a <= b <= N 
 0 <= k <= 106
 */

public class FillingJars {
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		long N = con.nextLong();
		if (isInRange(3, 10000000, N)) {
			long M = con.nextLong();
			if (isInRange(1, 100000, M)) {
				long total = 0;
				for (long i = 0; i < M; i++) {
					long a = con.nextLong();
					long b = con.nextLong();
					long k = con.nextLong();
					if (isInRange(1, N, b) && isInRange(1, b, a)) {
						if (isInRange(0, 1000000, k)) {
							total += (b - a + 1) * k;
						}
					}
				}
				System.out.println(total / N);
			}
		}
		con.close();
	}

	private static boolean isInRange(long min, long max, long val) {
		return (val >= min && val <= max);
	}
}
