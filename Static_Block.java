package HackerRank_Examples;
import java.util.*;
public class Static_Block {
	static int B, H;
	static boolean flag = true;
	static{
		
		System.out.println("Static block invoked.");
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the value of B: ");
		B = input.nextInt();
		System.out.print("\nEnter the value of H: ");
		H = input.nextInt();
		input.close();
		
		if (B<=0 || H<=0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}	
	}
	
	public static void main(String[] arg) {
		if (flag) {
			int area = B*H;
			System.out.println("Area: " + area);
		}
		System.out.println("main method invoked");
	}
}
