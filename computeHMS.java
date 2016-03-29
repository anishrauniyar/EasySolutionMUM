import java.util.Scanner;

/*
 * Write a method named computeHMS that computes the number of hours, minutes and seconds 
 * in a given number of seconds. 
 * Example: 3735 returns {1, 2, 15}	
 * because 3735 = 1*3600 + 2*60 + 15. 
 * In other words, 3,735 is the number of seconds in 1 hour 2 minutes and 15 seconds
 */

public class computeHMS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the second: ");
		int second = sc.nextInt();
		
		if (second < 0) {
			System.out.println("The seconds can not be negative.");
		} else {
			int[] hms = computesHMS(second);
			
			System.out.println("Hour: " + hms[0] + " Minute: " + hms[1] + " Second: " + hms[2]);
		}
		
		sc.close();
		
	}

	private static int[] computesHMS(int second) {
		// TODO Auto-generated method stub
		int hour = 0;
		int minute = 0;
		int sec = 0;
		if (second >= 3600) {
			hour = second / 3600;
			second = second - hour * 3600;
			if (second >= 60) {
				minute = second / 60;
				second = second - minute * 60;
				if (second < 60) {
					sec = second;
				}
			} else if (second < 60) {
				minute = 0;
				sec = second;
			}
		} else if (second < 3600 && second >= 60) {
			hour = 0;
			minute = second / 60;
			second = second - minute * 60;
			if (second < 60) {
				sec = second;
			}
		} else if (second < 60) {
			hour = 0;
			minute = 0;
			sec = second;
		}
		int[] hms = new int[]{hour, minute,sec};
		return hms;
	}
	
}
