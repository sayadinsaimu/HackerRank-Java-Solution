package HackerRank_Examples;

import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the input taken number : ");
		int num = input.nextInt();
		input.nextLine();// for new line input
		
		for(int i=1; i<=num; i++) {
			
			System.out.print("Enter the string: ");
			String str = input.nextLine();
			
			try {
				Pattern.compile(str);
				System.out.println("Valid");
			}
			catch (Exception e){
				System.out.println("Invalid");
			}
		}
		input.close();	
	}
}
