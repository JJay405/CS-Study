import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = { { 12, 34, 21, 54 }, { 10, 11, 43 }, { 1, 14 } };
		int row;
		// Calculate the total of all of the elements in arr
		int total = getTotal(arr);
		// Find the maximum number in row i
		System.out.println("Enter a row number between 0-2: ");
		row = sc.nextInt();
		int highest = getMaxInARow(arr[row]);

		System.out.println("The total of all the elements is: " + total);
		System.out.println("The highest number of row number " + row + " is  " + highest);
	}

	public static int getTotal(int[][] arr) {

		int totalNum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				totalNum += arr[i][j];
			}
		}

		return totalNum;
	}

	public static int getMaxInARow(int[] arr) {

		int highest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (highest < arr[i])
				
				highest = arr[i];

		}
		return highest;
	}
