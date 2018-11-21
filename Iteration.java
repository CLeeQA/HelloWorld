package helloWorldIteration;

public class Iteration {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(addIntegers(i, i + i, true));
		}
	}
	public static int addIntegers(int A, int B, boolean addValues) {
		if (A == 0) {
			return B;
		}
		if (B == 0) {
			return A;
		}
		if (addValues) {
			return A + B;
		} else {
			return A * B;
		}
	}
}
