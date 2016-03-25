import java.util.Scanner;


// example: next perfect square of 5 is 9 

public class PerfectSquare {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int n = 0;
		try {
			n = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("This is not a number");
			n = 0;
		}
		
		if (n == 0) {
			System.out.println("The next perfect square is: 1");
		} else if (n < 0) {
			System.out.println("The next perfect square is: 0");
		} else if (n > 0) {
			int nextPerfect = isPerfectSquare(n);
			System.out.println("The next perfect square is: " + nextPerfect);
		}
		sc.close();
	}

	private static int isPerfectSquare(int n) {
		// TODO Auto-generated method stub
		double perf = 0;
		for (int i = n+1; ;i++) {
			perf = Math.sqrt(i);
			if (perf % 1 == 0) {
				break;
			}
		}
		return (int) (perf*perf);
	}
	
}
