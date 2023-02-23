package HackerRank_Examples;

import java.util.Scanner;

public class Loop_2 {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the query numbers: ");
		int q = input.nextInt();
		
		for (int x =1; x<=q; x++) {
			System.out.print("Enter the value of a,b, n for series "+x+" : ");
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();
			
			for (int j = 0; j<n; j++) {
				a+= b;
				/*if (j>0) {
					System.out.print(" ");
				}*/
				System.out.print(a+" ");
				b = b*2;
			}
			System.out.print("\n");
		}
		input.close();
	}
}
