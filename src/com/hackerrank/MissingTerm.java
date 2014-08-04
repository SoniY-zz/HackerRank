package com.hackerrank;
import java.util.Scanner;

public class MissingTerm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if (isInRange(3, 2500, N)) {
			int[] nums = new int[N];
			int diff = 0;
			for (int i = 0; i < nums.length; i++) {
				nums[i] = in.nextInt();
				if (i > 0) {
					int tmp = nums[i] - nums[i - 1];
					if (i > 1 && tmp < diff) {
						diff = tmp;
					} else {
						diff = tmp;
					}
				}
			}
			System.out.println(findMissingTerm(nums,diff));
		} else {
			System.out.println("Bad Input.");
		}
		in.close();
	}

	private static int findMissingTerm(int[] nums, int diff) {
		int next = 0;
		for (int i = 0; i < (nums.length - 1); i++) {
			next = nums[i] + diff;
			if (next != nums[i + 1]) {
				break;
			}
		}
		return next;
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}
