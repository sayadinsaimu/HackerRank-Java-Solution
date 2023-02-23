package HackerRank_Examples;
import java.util.*;

public class Palindrome_String {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		input.close();
		
		System.out.println("String length: " + str.length());
		String reverse = "";
		for( int i = (str.length()-1); i>=0; i--) {
			reverse = reverse + str.charAt(i);
			System.out.println(reverse);
		}
		if (str.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(str + " is palindrome");
		}
		else System.out.println(str + " is not palindrome");
	}
}
