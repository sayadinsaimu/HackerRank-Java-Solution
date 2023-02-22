package Examples;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int x = 0; x<n; x++){
			a[x] = sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					System.out.print(a[k]+"  ");
					sum = sum +a[k];
				}
				System.out.print("\n");
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.print(count);
		
	}
}
