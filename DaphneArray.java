import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * A Daphne array is defined to be an array that contains at least one odd number and  
 * begins and ends with the same number of even numbers.

 So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because 
 it begins with three even numbers and ends with three even numbers and 
 it contains at least one odd number

 The array {2, 4, 6, 8, 6} is not a Daphne array because 
 it does not contain an odd number.

 The array {2, 8, 7, 10, -4, 6} is not a Daphne array because 
 it begins with two even numbers but ends with three even numbers.

*/

public class DaphneArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] value = new int[size];
		System.out.println("Enter the values:");
		for (int i = 0; i < size; i++) {
			value[i] = sc.nextInt();
		}
		
		int test = isDaphne(value);
		
		if (test == 1) {
			System.out.println("The array is a Daphne Array.");
		} else {
			System.out.println("The array is not a Daphne Array.");
		}
		
		sc.close();
		
	}

	private static int isDaphne(int[] value) {
		// TODO Auto-generated method stub
		List<Integer> startEven = new ArrayList<Integer>();
		List<Integer> endEven = new ArrayList<Integer>();
		int isOdd = 0;
		for (int i = 0; i < value.length; i++) {
			if (value[i] % 2 != 0) {
				isOdd++;
			}
		}
		if (isOdd == 0) {
			System.out.println("There is no odd value in the array.");
			return 0;
		} else if (value[0] % 2 != 0) {
			System.out.println("The first value is odd.");
			return 0;
		} else if (value[value.length-1] % 2 != 0) {
			System.out.println("The last value is odd.");
			return 0;
		} else {
			for (int i = 0; i < value.length; i++) {
				if (value[i] % 2 == 0) {
					startEven.add(value[i]);
				} else {
					break;
				}
			}
			for (int i = value.length-1; i >= 0; i--) {
				if (value[i] % 2 == 0) {
					endEven.add(value[i]);
				} else {
					break;
				}
			}
			
			if (startEven.size() == endEven.size()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
}