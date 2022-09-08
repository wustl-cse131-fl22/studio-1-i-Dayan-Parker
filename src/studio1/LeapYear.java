package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year to test");
		int x = in.nextInt();
		
		boolean leapYear = (x%4 == 0) && (100%x != 0) || (x == 400);
		System.out.println(leapYear);
	}

}
