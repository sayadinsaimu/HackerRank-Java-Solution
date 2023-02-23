package HackerRank_Examples;

import java.util.*;

public class If_Else {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number between 1~100: ");
		int n = input.nextInt();
		if(1<=n && n<=100) {
			int r = n%2;
			if (r!=0) {
				System.out.println("Weird");
			}
			else if(r==0 && (n>=2 && n<=5)) {
				System.out.println("Not Weird");
			}
			else if(r==0 && (n>=6 && n<=20)) {
				System.out.println("Weird");
			}
			else if(r==0 && n>20) {
				System.out.println("Not Weird");
			}
		}
		else System.out.println("Entered number is out of range.");
		input.close();
	}
}
