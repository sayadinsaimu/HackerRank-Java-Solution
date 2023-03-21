package Java_PrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n = scan.nextBigInteger();
	    scan.close();
	      if (n.isProbablePrime(100)) {
	          System.out.println("prime");
	      } else {
	          System.out.println("not prime");
	      }
	}
}
