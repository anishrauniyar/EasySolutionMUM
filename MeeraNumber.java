import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *A Meera number is a number such that the number of nontrivial factors is a factor of the number. 
 *For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. 
 *(A nontrivial factor is a factor other than 1 and the number). 
 *Thus 6 has two nontrivial factors. Now, 2 is a factor of 6. 
 *Thus the number of nontrivial factors is a factor of 6. 
 *Hence 6 is a Meera number. 
 *Another Meera number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. 
 *Thus 30 has 6 nontrivial factors. Note that 6 is a factor of 30. 
 *So 30 is a Meera Number.However 21 is not a Meera number. 
 *The nontrivial factors of 21 are 3 and 7. 
 *Thus the number of nontrivial factors is 2. 
 *Note that 2 is not a factor of 21. Therefore, 21 is not a Meera number. 
 */

public class MeeraNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to check the Meera Number: ");
		int value = sc.nextInt();
		
		int test = isMeeraNumber(value);
		
		if (test == 1) {
			System.out.println("The number is a Meera Number.");
		} else {
			System.out.println("The number is not a Meera Number.");
		}
		
		sc.close();
	}

	private static int isMeeraNumber(int value) {
		// TODO Auto-generated method stub
		List<Integer> nonTrivialFactor = new ArrayList<Integer>();
		System.out.println("The nonTrivial factor are: ");
		for (int i = 2; i <= value/2 && i != value; i++) {
			if (value % i == 0) {
				nonTrivialFactor.add(i);
				System.out.println(i);
			}
		}
		System.out.println("Total Number of Factor is: " + nonTrivialFactor.size());
		if (value % nonTrivialFactor.size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
