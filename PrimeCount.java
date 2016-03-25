import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// example: prime number between 3 and 10 inclusive are 3, 5, 7

public class PrimeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end values: " );
		int start = sc.nextInt();
		int end = sc.nextInt();
		int[] primeNum = PrimeCount.primeCount(start, end);
		List<Integer> primeList = new ArrayList<Integer>();
		primeList = PrimeCount.primeList(start, end);
		System.out.println("The prime numbers are: \n");
		for (int i = 0; i < primeNum.length; i++) { 
			System.out.println(primeNum[i] +"\t");
		}
		System.out.println("The prime list are: \n" );
		for (int i = 0; i < primeList.size(); i++) {
			System.out.println(primeList.get(i));
		}
		sc.close();
	}
	
	private static List<Integer> primeList(int start, int end) {
		// TODO Auto-generated method stub
		List<Integer> prime = new ArrayList<Integer>();
		int k = 0;
		int flag = 0;
		if (start < 0) start = 0;
		if (end < 0) end = 0;
		for (int i = start; i<=end; i++){
			if (i == 1) {
				prime.add(i);
			} else if (i == 2) {
				prime.add(i);
			} else {
				for (int l = 2; l < i; l++){
					if (i % l == 0){
						flag++;
					}
				}
				if (flag == 0) {
					prime.add(i);
				}
			}
			flag = 0;
		}
		return prime;
	}

	public static int[] primeCount(int start, int end) {
		int[] prime = new int[end-start+1];
		int k = 0;
		int flag = 0;
		if (start < 0) start = 0;
		if (end < 0) end = 0;
		for (int i = start; i<=end; i++){
			if (i == 1) {
				prime[k] = i;
				k++;
			} else if (i == 2) {
				prime[k] = i;
				k++;
			} else {
				for (int l = 2; l < i; l++){
					if (i % l == 0){
						flag++;
					}
				}
				if (flag == 0) {
					prime[k] = i;
					k++;
				}
			}
			flag = 0;
		}
		return prime;
	}
	
}
