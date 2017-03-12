package tasks;

// Fibonacci: 1-1-2-3-5-8-13...
public class Fibonacci {

	public static int getFibonacci(int n) {
		if(n == 1) {
			return 0;
		} else if(n == 2) {
			return 1;
		} else {
			return getFibonacci(n-1) + getFibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(getFibonacci(i));
		}
	}
	
}
