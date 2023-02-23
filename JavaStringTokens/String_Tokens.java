package JavaStringTokens;

import java.util.*;

public class String_Tokens {
	 public static void main(String[] arg) {
		 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string : "); String s = input.nextLine();
		input.close();
			 
		 
		 //String s = "he is a very very good boy, isn't he?";
		 
		 s = s.trim();
		 if (s.length()==0) {
			 System.out.println("0");
			 return;
		 }
		 
		 //String[] split_array = s.split("'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)");
		 //String[] split_array = s.split("[\\s,;'?:~!#$%^&*()-+{}|/><]+");
		 
		 //String[] split_array = s.split("[ !,?._'@]+"); //ok
		 String[] split_array = s.split("[^A-Za-z]+"); //ok
		 System.out.println(split_array.length);
		 for (String result : split_array) {
			 System.out.println(result);
		 }
	 }
}
