package helloWorldIterationArray;

public class IterationArray2 {
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i : myArray) {
			System.out.print(i + ", ");
		}
		for (int j = 0; j < myArray.length; j++) {
			myArray[j] *= 10;
			System.out.print(myArray[j] + ", ");
		}
	}
}
