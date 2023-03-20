package Java_Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Java_Hashset {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		// write your code here
		HashSet<String> pair = new HashSet<>(t);
		for (int i = 0; i < t; i++) {
			pair.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(pair.size());
		}
		s.close();
	}
}
