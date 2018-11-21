package helloWorldConditionals;

public class Conditionals2 {
	public static void main(String[] args) {
		System.out.println(addIntegers(3, 6, false));
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
