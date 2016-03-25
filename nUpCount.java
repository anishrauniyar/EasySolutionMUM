import java.io.Serializable;
import java.util.Scanner;

// example: 5-upcount of the array {2,3,1,-6,8,-3,-1,2} is 3 

public class nUpCount implements Serializable  {

	public static void main(String[] args) {
		
		Scanner countSc = new Scanner(System.in);
		System.out.println("Number of arrays: ");
		int count = countSc.nextInt();
		System.out.println("Enter the " + count + " numbers for array.");
		Scanner valueSc = new Scanner(System.in);
		int[] value = new int[count];
		for (int i = 0; i < count; i++) {
			//if (valueSc.hasNextInt()){
			value[i] = valueSc.nextInt();
			//}
		}
		
		Scanner upcountSc = new Scanner(System.in);
		System.out.println("Enter the upcount number: ");
		int upcount = upcountSc.nextInt();
		
		int totalupCount = nUpCount.nUpCounts(value, upcount);
		System.out.println("The total upcount is: " + totalupCount);
		
		countSc.close();
		valueSc.close();
		upcountSc.close();
	}
	
	public static int nUpCounts(int[] a, int n) {
		System.out.println(a.length + " " + a[0] + " " + n);
		int length = a.length;
		int totalSum = 0;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + a[i];
			System.out.println(sum);
			if (sum > n) {
				totalSum++;
			}
		}
		return totalSum;
	}
	
}