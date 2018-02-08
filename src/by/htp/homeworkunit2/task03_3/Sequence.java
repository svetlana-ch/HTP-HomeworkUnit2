package by.htp.homeworkunit2.task03_3;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {

		double[] arr = new double[4];

		enterDoubleArray(arr);

		printDoubleArray(arr);
		
		if (isIncreasing(arr)) {
			System.out.println("Последовательность возрастает");
		}
		else {
			System.out.println("Последовательность не возрастает");
		}

	}
	
public static double[] enterDoubleArray(double[] array) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Введите число: ");

			while (!sc.hasNextDouble()) {
				sc.next();
			}

			array[i] = sc.nextDouble();

		}

		return array;		
	}
	
	public static void printDoubleArray(double[] array) {		

		for (double x : array) {

			System.out.printf("[%.3f] ", x);

		}
		System.out.println();

	}
	
	public static boolean isIncreasing(double[] array) {		

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] >= array[i+1]) {
				return false;
			}
		}
		
		return true;

	}

}
