import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * An array is defined to be inertial if the following conditions hold:
 a. it contains at least one odd value
 b. the maximum value in the array is even
 c. every odd value is greater than every even value that is not the maximum value. 

So {11, 4, 20, 9, 2, 8} is inertial because 
 a. it contains at least one odd value
 b. the maximum value in the array is 20 which is even
 c. the two odd values (11 and 9) are greater than all the      
    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.

 */

public class Inertial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the input array: ");
		int size = sc.nextInt();
		int[] value = new int[size];
		System.out.println("Enter the values: ");
		for(int i = 0; i < size; i++) {
			value[i] = sc.nextInt();
 		}
		
		if (size <= 1) {
			System.out.println("The array is not iniertial.");
		} else {
			int test = Inertial.isInertial(value);
			
			if (test == 1) {
				System.out.println("The array is inertial.");
			} else {
				System.out.println("The array is not iniertial.");
			}
		}
		
		sc.close();
	}

	private static int isInertial(int[] value) {
		// TODO Auto-generated method stub
		int testEvenMax = 0;
		int testOddGreater = 0;
		
		int testOddValue = Inertial.isOddValue(value);
		if (testOddValue == 1){
			testEvenMax = Inertial.isEvenMax(value);
		} else {
			return 0;
		}
		if (testOddValue == 1 && testEvenMax == 1) {
			testOddGreater = Inertial.isOddGreater(value);
		} else {
			return 0;
		}
		if (testOddValue == 0 || testEvenMax == 0 || testOddGreater == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	private static int isOddGreater(int[] value) {
		// TODO Auto-generated method stub
		int len = value.length; 
		int flag = 0;
		List<Integer> even = new ArrayList<Integer>(); //can use array but list preferred 
		List<Integer> odd = new ArrayList<Integer>(); //can use array but list preferred 
		int maxEven = Inertial.getMaxEven(value);
		for (int i = 0; i < len; i++) {
			if (value[i] % 2 == 0) {
				if (value[i] != maxEven) {
					even.add(value[i]);
				}
			} else {
				odd.add(value[i]);
			}
		}
		for (int i = 0; i < odd.size(); i++) {
			for (int k = 0; k < even.size(); k++) {
				if (odd.get(i) < even.get(k)) {
					flag++;
					break;
				}
			}
		}
		if (flag == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int getMaxEven(int[] value) {
		// TODO Auto-generated method stub
		int len = value.length;
		int max = value[1];
		for (int i = 0; i < len; i++) {
			if (value[i] > max) {
				max = value[i];
			}
		}
		return max;
	}

	private static int isEvenMax(int[] value) {
		// TODO Auto-generated method stub
		int len = value.length;
		int max = value[1];
		for (int i = 0; i < len; i++) {
			if (value[i] > max) {
				max = value[i];
			}
		}
		if (max % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int isOddValue(int[] value) {
		// TODO Auto-generated method stub
		int len = value.length;
		int flag = 0;
		for (int i = 0; i < len; i++) {
			if (value[i] % 2 != 0) {
				flag++;
				break;
			}
		}
		if (flag != 0) {
			return 1;
		} else {
			return 0;
		}
	}
}