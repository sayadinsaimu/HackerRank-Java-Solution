package HackerRank_Examples;
import java.util.*;

public class Substring_Comparison {
	
	public static String getSmallestAndLargest(String s, int k) {
		String str = s.substring(0,k);
		String smallest = str ;
		String largest = str;
		
		for(int i=1; i<=s.length()-k; i++) {
			str = s.substring(i, i+k);
			if(str.compareTo(smallest)<0) {
				smallest = str;
			}
			/*if(str.compareTo(largest)>0) {
				largest = str;
			}	*/
			else largest = str;
		}
		
		return smallest + "\n" + largest;
	}	
	
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int k = input.nextInt();
		input.close();
		
		System.out.println(getSmallestAndLargest(s, k));
		
	}
}
