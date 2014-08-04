package com.hackerrank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Occurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String A = in.nextLine().toLowerCase();
		String B = in.nextLine().toLowerCase();

		HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
		for (char c : A.toCharArray()) {
			if (characters.containsKey(c)) {
				characters.put(c, characters.get(c) + 1);
			} else {
				characters.put(c, 1);
			}
		}

		HashSet<Character> strB = new HashSet<Character>();
		int total = 0;
		for (char c : B.toCharArray()) {
			if (!strB.contains(c)) {
				int cnt = characters.containsKey(c) ? characters.get(c) : 0;
				total += cnt;
				strB.add(c);
			}
		}
		System.out.println(total);
		in.close();
	}

}
