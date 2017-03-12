package tasks;

/*
 * 0! = 1
 * 1! = 1
 * 2! = 2
 * 3! = 6
 */
public class Factorial {

	public static int getFactorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(getFactorial(i));
		}
	}
}
