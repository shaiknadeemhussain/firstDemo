package fundamentalsOfCoding;

import java.util.Scanner;

public class Array2DExample1 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// Step 1:take size and initilize 2d array
		System.out.println("Enter size of the array");
		int sizeOfArray = in.nextInt();
		int[][] arr = new int[sizeOfArray][sizeOfArray];
		int[][] initializedArray = inilitializeArray(arr);
		// step 2: transversse through array and print
	
		toPrintElements(initializedArray);
		//step 3: to print elements present in the first out ring
		int []elementsIn1stOuterRing=togetElementsouterRing(initializedArray);
		toGetElementsInnerRing(initializedArray);
	}

	private static void toGetElementsInnerRing(int[][] initializedArray) {
		System.out.println("inner ring elements");
		for(int i=2;i<initializedArray.length-2;i++) {
			for(int j=2;j<initializedArray.length-2;j++) {
				System.out.print(initializedArray[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		
		
	}

	private static int[] togetElementsouterRing(int[][] initializedArray) {
		System.out.println("to get outer element");
		for(int i=1 ;i<initializedArray.length-1;i++) {
			for(int j=1;j<initializedArray.length-1;j++) {
				System.out.print(initializedArray[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		return null;
	}

	private /* int[][] */ static void toPrintElements(int[][] initializedArray) {
		for (int i = 0; i < initializedArray.length; i++) {
			System.out.println();
			for (int j = 0; j < initializedArray[i].length; j++) {
				System.out.print(initializedArray[i][j] + " ");

			}
		}
		System.out.println("\n");

	}

	private static int[][] inilitializeArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter elements of" + i + "th row");
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = in.nextInt();

			}
		}
		return arr;
	}

}
