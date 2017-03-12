package tasks;

public class SwappingNumbers {

	public static void swapTwoNumbers(int a, int b) {
		System.out.println("Before swapping a: " + a + " b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a: " + a + " b: " + b);
	}
	
	public static void main(String[] args) {
		swapTwoNumbers(10, 20);
	}

}
