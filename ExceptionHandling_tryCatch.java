package Examples;

import java.util.*;

public class ExceptionHandling_tryCatch {
	public static void main(String[] arg) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.print(x/y);
		}
		catch(ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		catch(InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}
		sc.close();
	}
}
