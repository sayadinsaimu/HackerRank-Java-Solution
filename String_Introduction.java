package HackerRank_Examples;
import java.util.*;

public class String_Introduction {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		int sum = A.length() + B.length();
		System.out.println(sum);
		
		int x = A.compareTo(B);
		if(x>0) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		/*
		String add = A.concat(B);//hellojava
		System.out.println(add);
		
		String fmt = String.format("%s %s", A, B);//hello java
		System.out.println(fmt);
		*/
		String str = A.substring(0,1).toUpperCase()+A.substring(1)+" "
		+B.substring(0,1).toUpperCase()+B.substring(1);
		System.out.println(str);
		
		input.close();
	}
}
