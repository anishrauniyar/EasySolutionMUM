import java.util.Scanner;

/*
 * example 139 is a porcupine number because:
    a. it is prime
    b. it ends in a 9
    c. The next prime number after it is 149 which also ends in 9.
    Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime 
    so 149 is the next prime number after 139.
 */

public class PorcupineNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find first porcupine number: ");
		int value = sc.nextInt();
		
		PorcupineNumber.findPorcupineNumber(value);
		
		sc.close();
		
	}

	private static void findPorcupineNumber(int value) {
		// TODO Auto-generated method stub
		int num = value;
		int test = 0;
		int isPrime = 0;
		int isPorcupine = 0;
		for (; ; ) {
			num++;
			test = PorcupineNumber.isPrime(num);
			if (test == 1) {
				isPrime++;
			}
			if (isPrime > 0 && num % 10 == 9) {
				isPorcupine = PorcupineNumber.isPorcupine(num);
			}
			if (isPorcupine == 1) {
				System.out.println("The next Porcupine number is: " + num);
				break;
			}
		}
		
	}

	private static int isPorcupine(int num) {
		// TODO Auto-generated method stub
		int isPrime = 0;
		num = num + 1;
		for (; ;) {
			isPrime = isPrime(num);
			if (isPrime == 1) {
				if (num % 10 == 9) {
					return 1;
				} else {
					return 0;
				}
			}
			num++;
		}
	}

	private static int isPrime(int num) {
		// TODO Auto-generated method stub
		int flag = 0;
		if (num == 1 || num == 2) {
			return 1;
		} else if (num <= 0) {
			return 0;
		} else if (num > 2) {
			for (int i = 2; i < num/2; i++) {
				if (num % i == 0) {
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
		return 0;
	}
	
}