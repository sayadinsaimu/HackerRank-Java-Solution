package JavaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_Biginteger {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.nextLine());
		BigInteger b = new BigInteger(in.nextLine());
		//BigInteger sum, multiply ;
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		in.close();
		
	}
}
