package Java1DArray;

import java.util.Scanner;

public class Java1DArray {
	public static void main(String[] args) {
		   
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size, n : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int x =0; x<n; x++){
        	System.out.print("Enter the value for a["+x+"] : ");
            a[x]= scan.nextInt();  
        }
        scan.close();
        System.out.println("Entered Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
