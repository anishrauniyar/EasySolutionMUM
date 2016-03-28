import java.util.Scanner;

/* 
 * example: {9, 0, 2, -5, 7} have total 2 square pairs.
 * since the square pairs are <2, 7> and <7, 9>. 
 * Note that <-5, 9> and <0, 9> are not square pairs, even though they sum to perfect squares, 
 * because both members of a square pair have to be greater than 0. 
 * Also <7,2> and <9,7> are not square pairs because the first number has to be less than 
 * the second number.
 */

public class SquarePair {

	public static void main(String[] argr) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] value = new int[size];
		System.out.println("Enter the values: ");
		for (int i = 0; i < size; i++) {
			value[i] = sc.nextInt();
		}
		
		int squarePairCount = SquarePair.countSquarePair(value);
		
		System.out.println("Total Square Pair is: " + squarePairCount);
		
		sc.close();
	}

	private static int countSquarePair(int[] value) {
		// TODO Auto-generated method stub
		int flag = 0;
		int a = 0, b = 0;
		double sum = 0;
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length; j++) {
				a = value[i];
				b = value[j];
				if (a < b  && a > 0 && b > 0) {
					sum = a + b;
					if (Math.sqrt(sum) % 1 == 0) {
						System.out.println("Pair: <" + a + ", " + b + ">");
						flag++;
					}
				}
				sum = 0;
			}
		}
		return flag;
	}
	
}
