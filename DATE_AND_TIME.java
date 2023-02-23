package HackerRank_Examples;

import java.io.*;
import java.util.*;
import java.time.LocalDate;

/*import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList; */

public class DATE_AND_TIME {
	
	public static String findDay(int month, int day, int year) {
        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, 
        Locale.US).toUpperCase();
        */
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.println("Date : "+ date);
		System.out.println("Month : "+ date.getMonth());
		System.out.println("Year : "+ date.getYear());
		System.out.println("Day of month : "+ date.getDayOfMonth());
		System.out.println("Day of week : "+ date.getDayOfWeek());
		System.out.println("Day of year : "+ date.getDayOfYear());
		System.out.println("month value : "+ date.getMonthValue());
	
	    return date.getDayOfWeek().toString(); 
    }
	
	public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
		
		
		Scanner scanner = new Scanner(System.in); 
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			int year = scanner.nextInt();
			String res = findDay(month, day, year);
			System.out.println(res);
			scanner.close();
    }
}
