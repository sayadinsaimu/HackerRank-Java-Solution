package JavaVarargs_SimpleAddition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

//write your code here
class Add{
	
	public void add(int... numbers) {
		int sum = 0;
		String separator = "";
		for (int i : numbers) {
			sum = sum + i;
			System.out.print(separator+ i);
			separator = "+";
		}
		System.out.println("="+ sum);
	}
}

public class JavaVarargs_SimpleAddition {
public static void main(String[] args) {
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		int n4 = Integer.parseInt(br.readLine());
		int n5 = Integer.parseInt(br.readLine());
		int n6 = Integer.parseInt(br.readLine());
		Add ob = new Add();
		ob.add(n1,n2);
		ob.add(n1,n2,n3);
		ob.add(n1,n2,n3,n4,n5);
		ob.add(n1,n2,n3,n4,n5,n6);
		
		Method[] methods = Add.class.getDeclaredMethods();
		Set<String> set = new HashSet<>();
		boolean overload = false;
		for (int i = 0; i < methods.length; i++) {
			if (set.contains(methods[i].getName())) {
				overload = true;
				break;
			}
			set.add(methods[i].getName());
		}
		if (overload) {
			throw new Exception("Overloading not allowed");
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
