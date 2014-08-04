package com.hackerrank;
import java.util.Scanner;

public class MaxXOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _a = in.nextInt();
		int _b = in.nextInt();
		in.close();

		int max = 0;
		for (int i = _a; i <= _b; i++) {
			for (int j = i; j <= _b; j++) {
				int curr = i ^ j;
				if (curr > max) {
					max = curr;
				}
			}
		}
		System.out.println(max);
	}
}