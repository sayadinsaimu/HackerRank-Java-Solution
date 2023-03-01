package JavaRegex;

import java.util.Scanner;

public class Solution {
	 public static void main(String []args) {
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()) {
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }
	        in.close();
	    }
}

/*
	[01]?\\d{1,2}   matches numbers 0-199.
	2[0-4]\\d       matches numbers 200-249
	25[0-5]         matches numbers 250-255
*/
class MyRegex{
	//String regex = "([01]?\\d{1,2}|2[0-4]\\d| 25[0-5])";   // not Ok
	String regex = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
	String pattern = regex+"\\."+regex+"\\."+regex+"\\."+regex;
}
