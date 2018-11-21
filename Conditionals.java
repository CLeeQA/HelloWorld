package helloWorldConditionals;

public class Conditionals {
	public static void main(String[] args) {
		System.out.println(addIntegers(3, 6, true));
		}
	public static int addIntegers(int A, int B, boolean addValues) {
		if (addValues) {
			return A + B;
		} else {
			return A * B;
		}
	}
}
