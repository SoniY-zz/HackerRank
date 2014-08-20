/*
Sunny and Johnny together have M dollars and want to spend the amount at an ice cream parlour. The parlour offers N flavors, and they want to choose 2 flavors so that they end up spending the whole amount.

You are given a list of cost of these N flavors. The cost of ith flavor is denoted by (ci). You have to display the indices of two flavors whose sum is M.

Input Format

The first line of the input contains T, T test cases follow.
Each test case follows the format: The first line contains M. The second line contains N. The third line contains N single space separated integers denoting the price of each flavor. Here, ith integer denotes ci.

Output Format

Output two integers, each of which is a valid index of the flavor. The lower index must be printed first. Indices are indexed from 1 to N.

Constraints

1 ≤ T ≤ 50
2 ≤ M ≤ 10000
2 ≤ N ≤ 10000
1 ≤ ci ≤ 10000
The prices of two items may be same and each test case has a unique solution.

Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3

Sample Output

1 4
1 2

Explanation

The sample input has two test cases. For the 1st, the amount M = 4 and there are 5 flavors at the store. The flavors indexed at 1 and 4 sums to 4. For the 2nd test case, the amount M = 4 and the flavors indexed at 1 and 2 sums to 4.
 */
package com.hackerrank;

import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if (isInRange(1, 50, T)) {
			for (int t = 0; t < T; t++) {
				int M = in.nextInt();
				int N = in.nextInt();
				if (isInRange(2, 10000, M) && isInRange(2, 10000, N)) {
					int[] values = new int[N];
					for (int i = 0; i < N; i++) {
						values[i] = in.nextInt();
					}
					for (int i = 0; i < N; i++) {
						for (int j = (i + 1); j < N; j++) {
							if ((M - values[i]) == values[j]) {
								System.out.println((i + 1) + " " + (j + 1));
							}
						}
					}
				}
			}
		}
		in.close();
	}

	public static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}

}
