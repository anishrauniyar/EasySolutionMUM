import java.util.Scanner;

/*
 * A Bean array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array. 

	For example, {2, 10, 9, 3} is a Bean array because
	2 = 3-1
	10 = 9+1
	3 = 2 + 1
	9 = 10 -1
	
	Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
	
	The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the 
	array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.

 */

public class BeanArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the input array: ");
		int size = sc.nextInt();
		int[] value = new int[size];
		System.out.println("Enter the values for the array: ");
		for (int i = 0; i < size; i++) {
			value[i] = sc.nextInt();
		}
		
		int test = isBeanArray(value);
		
		if (test == 1) {
			System.out.println("The array is Bean Array.");
		} else {
			System.out.println("The array is not a Bean Array.");
		}
		
	}

	private static int isBeanArray(int[] value) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (int i = 0; i < value.length; i++) {
			flag = 0;
			for (int k = 0; k < value.length; k++) {
				if (((value[i]+1) == value[k]) || ((value[i]-1) == value[k])) {
					flag++;
				}
			}
			if (flag == 0) {
				return 0;
			}
		}
		return 1;
	}
	
}
