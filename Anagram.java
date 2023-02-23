package HackerRank_Examples;

import java.util.*;

public class Anagram {
	static boolean isAnagram(String a, String b) {
		if (a.length()!= b.length()) {
			return false;
		}
			a = a.toLowerCase();
			b = b.toLowerCase();
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			String str1 = new String(a1);
			String str2 = new String(b1);
			System.out.println("After sorting, new String 1: " + str1);
			System.out.println("After sorting, new String 2: " + str2);
			
			if (str1.equals(str2)) {
				System.out.println("Both string are same.");
				
			}
		return true;		
			
	}
	
	public static void main (String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st string: ");
		String a = input.nextLine();
		System.out.print("Enter 2nd string: ");
		String b = input.nextLine();
		input.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret)? "\nanagram" : "\nNot Anagram");
		
	}
}
