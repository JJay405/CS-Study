package babygrowth;

import java.util.Scanner;

import java.io.*;
import java.util.Arrays;

public class growth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double[] percentile = { 3, 5, 10, 25, 50, 75, 90, 95, 97 };
		File file = new File("C:\\\\Users\\\\liulo\\\\Downloads\\\\BabyGrowth.txt");
		Scanner sc = new Scanner(file);

		double[][] myArray = new double[37][9];
		for (int i = 0; i < 37; i++) {

			for (int j = 0; j < 9; j++) {

				myArray[i][j] = sc.nextDouble();
			}
		}

		sc.close();

		Scanner keyboard = new Scanner(System.in);
		int babyAge;
		double babyHeight;

		System.out.println("Enter the baby's age in month between birth(0) to 36 months: ");

		babyAge = keyboard.nextInt();

		System.out.println("Enter the baby's height in centimeter between 41-104: ");

		babyHeight = keyboard.nextDouble();

		if (babyHeight < myArray[babyAge][0] || babyHeight > myArray[babyAge][8])

			System.out.println("Abnormal measurement!");

		else {int index = findCol(myArray[babyAge], babyHeight);

		System.out.println("Baby's percentile is: " + percentile[index] + "%");
		}
	}

	public static int findCol(double[] myArray, double babyHeight) {

		for (int i = 0; i < 9; i++) {
			if (babyHeight > myArray[i] && babyHeight < myArray[i + 1])

				return i;

		}
		return -10;
	}

}
