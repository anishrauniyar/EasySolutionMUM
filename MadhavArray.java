import java.util.Scanner;

/* 
 * example: {2,1,1} is Madhav array since 2 = 1 + 1
 * example: {2,1,1,4,-1,-1} is Madhav array since 2 = 1 + 1 = 4 + (-1) + (-1)
*/

public class MadhavArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		System.out.println("Enter the values of the array:\n");
		int[] value = new int[size];
		for (int i = 0; i < size; i++) {
			value[i] = sc.nextInt();
		}
		int test = isMadhavArray(value);
		if (test == 1) {
			System.out.println("The array is Madhav array");
		} else {
			System.out.println("The array is not a Madhav array");
		}
	}
	
	public static int isMadhavArray(int[] a) {
		int sum = 0;
		int flag = 0;
		int len = a.length;
		int i = 0;
		while(i < (len -1)) {
			sum = a[++i] + a[++i];
			System.out.println("i: " + i);
			if (i > 3) {
				for (int k = 3; k < i; k++) {
					System.out.println("i i: " + i);
					sum += a[++i];
				}
			}
			System.out.println(sum);
			if (sum != a[0]) {
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