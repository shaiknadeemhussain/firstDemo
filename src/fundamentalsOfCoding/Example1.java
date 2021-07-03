package fundamentalsOfCoding;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do {
			boolean b=false;
			ShowMenu();
			System.out.println("Enter your option");
			int option=in.nextInt();
			System.out.println("Enter starting range");
			int start=in.nextInt();
            System.out.println("Enter ending range");
			int end=in.nextInt();
			switch(option) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				b=false;
				break;
			
			default: 
			System.out.println("enter correct option");
			break;
			} 
		}
		while(true);

	}

	private static void ShowMenu() {
		System.out.println(" 1)To count how many prime numbers in given range \n "
				+ "2)to count how many even and odd numbers in given range \n "
				+ "3)fibonacci series in given range \n "
				+ "4)exit from the program");
		
	}

}
