/* 
In the Quicksort challenges, you sorted an entire array. Sometimes, you just need specific information about a list of numbers, and doing a full sort would be unnecessary. Can you figure out a way to use your partition code to find the median in an array?

Challenge
Given a list of numbers, can you find the median?

Input Format
There will be two lines of input:

    n - the size of the array
    ar - n numbers that makes up the array

Output Format
Output one integer, the median.

Constraints
1<= n <= 1000001
-10000 <= x <= 10000 , x ∈ ar
There will be an odd number of elements.

Sample Input

7
0 1 2 4 6 5 3

Sample Output

3
 */

package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (isInRange(1, 1000001, n)) {
			int[] an = new int[n];
			for (int i = 0; i < n; i++) {
				int tmp = in.nextInt();
				if (isInRange(-10000, 10000, tmp)) {
					an[i] = tmp;
				}
			}
			Arrays.sort(an);
			System.out.println(an[n / 2]);
		}
		in.close();
	}

	public static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}

}
