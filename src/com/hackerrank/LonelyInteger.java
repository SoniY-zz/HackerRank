package com.hackerrank;

/*
 There are N integers in an array A. All but one integer occur in pairs. Your task is to find out the number that occurs only once.

 Input Format

 The first line of the input contains an integer N indicating number of integers. 
 The next line contains N space separated integers that form the array A.

 Constraints

 1 <= N < 100 
 N % 2 = 1 ( N is an odd number ) 
 0 <= A[i] <= 100, ∀ i ∈ [1, N]

 Output Format

 Output S, the number that occurs only once.

 Sample Input:1

 1
 1
 Sample Output:1

 1
 Sample Input:2

 3
 1 1 2
 Sample Output:2

 2
 Sample Input:3

 5
 0 0 1 2 1
 Sample Output:3

 2
 Explanation

 In the first input, we see only 1 element and that element is the answer (1). 
 In the second input, we see 3 elements, 1 is repeated twice. The element that occurs only once is 2. 
 In the third input, we see 5 elements, 1 and 0 are repeated twice. And the element that occurs only once is 2. 
 */

import java.util.HashMap;
import java.util.Scanner;

public class LonelyInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		HashMap<Integer, Integer> vals = new HashMap<>();
		for (int i = 0; i < size; i++) {
			int tmp = in.nextInt();
			if (vals.containsKey(tmp)) {
				vals.put(tmp, vals.get(tmp) + 1);
			} else {
				vals.put(tmp, 1);
			}
		}

		for (Integer key : vals.keySet()) {
			if (vals.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
		in.close();
	}
}
