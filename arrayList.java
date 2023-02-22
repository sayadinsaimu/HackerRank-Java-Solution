package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enthe the number of lines, n : ");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> main_arr = new ArrayList<ArrayList<Integer>>();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Enthe the number of integer  d : ");
			int d = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j=1; j<=d; j++) {
				int value = sc.nextInt();
				arr.add(value);
			}
			System.out.println(arr.get(1));
			main_arr.add(arr);
		}
		System.out.println("\nArray List : "+ main_arr);
		System.out.print("Enthe the number of queries, q : ");
		int q = sc.nextInt();
		for(int i=1; i<=q; i++) {
			System.out.println("Enthe the position : ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			try {
				System.out.println(main_arr.get(x-1).get(y-1));
			}
			catch(Exception e){
				System.out.println("ERROR!");
			}	
		}
		
		sc.close();
	}
}
