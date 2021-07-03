package fundamentalsOfCoding;

import java.util.Scanner;

/*
 * create a n*n matrix then ask users for 2 row numbers,
 * lets say row 1 and row 4 then swap those two rows
 */
public class Swapping2dArray {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		int size=in.nextInt();
		int [][]arr=new int[size][size];
	 int [][]initializedArray=initializeArray(arr);
      printElements(initializedArray);
      toSwapElements(initializedArray);
	}

	private static void toSwapElements(int[][] initializedArray) {
		// TODO Auto-generated method stub
		
	}

	private static void printElements(int[][] initializedArray) {
		System.out.println("elements entered");
		for(int i=0;i<initializedArray.length;i++)
		{
		for(int j=0;j<initializedArray.length;j++)
		{
		System.out.print(initializedArray[i][j]+" ");	
		}
		System.out.println("\n");
		}
	}

	private static int[][] initializeArray(int[][] arr) {
	//	System.out.println("elements entered");
		
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter elements of "+i+"th row");
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=in.nextInt();
		}
		
	}
	
	
		return arr;
	}

}
