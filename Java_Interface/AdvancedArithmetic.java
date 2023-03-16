package Java_Interface;

public interface AdvancedArithmetic {
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i = 1; i<=n; i++) {
			if (n%i ==0) {
				sum = sum+i;			
			}
		}
		return sum;
	}
}
