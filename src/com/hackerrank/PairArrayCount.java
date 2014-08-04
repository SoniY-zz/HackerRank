package com.hackerrank;
import java.util.HashSet;
import java.util.Scanner;

public class PairArrayCount {
	// 1 4 5 7 8 9
	// 3 (1,4)
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String val = in.nextLine();
		String[] array = val.split("\\s");
		HashSet<Integer> vals = new HashSet<Integer>();
		for (String s : array) {
			vals.add(Integer.parseInt(s));
		}
		int diff = in.nextInt();
		int count = 0;
		for (Integer i : vals) {
			int pair = i + diff;
			if (vals.contains(pair)) {
				//System.out.println("{ " + i + " , " + pair + " }");
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
