import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Start with a positive number n
	if n is even then divide by 2
	if n is odd then multiply by 3 and add 1
	continue this until n becomes 1

	The Guthrie sequence of a positive number n is defined to be the numbers generated 
	by the above algorithm.

	For example, the Guthrie sequence of the number 7 is 
	7,  22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
 */

public class GuthrieSequence {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for Guthrie Sequence: ");
		List<Integer> value = new ArrayList<Integer>();
		for (;;) {
			int val = sc.nextInt();
			value.add(val);
			if (val == 1) {
				break;
			}
		}
		
		int test = isGuthrieSequence(value);
		 if (test == 1) {
			 System.out.println("The sequence is Guthrie Sequence.");
		 } else {
			 System.out.println("The sequence is not Guthrie Sequence.");
		 }
		
	}

	private static int isGuthrieSequence(List<Integer> value) {
		// TODO Auto-generated method stub
		int start = value.get(0);
		int flag = 0;
		List<Integer> actualSeries = new ArrayList<Integer>();
		actualSeries.add(start);
		if (start < 0) {
			return 0;
		} else {
			for (;;) {
				if (start % 2 == 0) {
					start = start / 2;
					actualSeries.add(start);
				} else {
					start = (start * 3) + 1;
					actualSeries.add(start);
				}
				if (start == 1) {
					flag++;
					break;
				}
			}
			if (flag == 1) {
				flag = 0;
				for (int i = 0; i < value.size(); i++) {
					if (value.get(i) != actualSeries.get(i)) {
						flag++;
						break;
					}
				}
				if (flag == 0) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}
	
}
