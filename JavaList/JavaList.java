package JavaList;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N,Q;
		//System.out.print("Enter the Length of List: ");
		N = in.nextInt();
		for(int i=1; i<=N; i++) {
			list.add(in.nextInt());
		}
		//System.out.print("Enter the number of queries: ");
		Q = in.nextInt();
		for(int j=1; j<=Q; j++) {
			//System.out.println("Enter the query name like 'Insert/Delete:  ");
			String s = in.next();
			if(s.equals("Insert")) {
				//System.out.print("Enter the index:  ");
				int index = in.nextInt();
				//System.out.print("Enter the value:  ");
				int value = in.nextInt();
				list.add(index, value);
			}
			else if(s.equals("Delete")) {
				//System.out.print("Enter the index:  ");
				int index = in.nextInt();
				list.remove(index);
			}
		}
		for(int k: list) {
			System.out.print(k +" ");
		}
		in.close();
	}
}
