package HackerRank_Examples;

import java.util.*;

public class Int_to_String {
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer number: ");
		int n = input.nextInt();
		
		String s = Integer.toString(n);
		if (n== Integer.parseInt(s)) {
			System.out.print("Good job.");
		}
		else System.out.print("Wrong answer.");
		input.close();
	}
}
