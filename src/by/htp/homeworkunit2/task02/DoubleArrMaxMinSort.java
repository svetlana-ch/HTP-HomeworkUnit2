package by.htp.homeworkunit2.task02;

import java.util.Scanner;

public class DoubleArrMaxMinSort {

	public static void main(String[] args) {
		
		double[] arr = new double[10];
		
		enterDoubleArray(arr);
		
		System.out.println("Самое большое число в массиве: " + findMax(arr));
		System.out.println("Самое маленькое число в массиве: " + findMin(arr) + " c индексом " + findMinIndex(arr));
		System.out.println();
		
		printDoubleArray(arr);
		
		sortDoubleArray(arr);
		
		printDoubleArray(arr);		

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
	
	public static double findMax(double[] array) {

		double max;
		max = array[0];

		for (int i = 1; i < array.length; i++) {
			
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static double findMin(double[] array) {

		double min;
		min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;

	}
	
	
	public static int findMinIndex(double[] array) {

		double min;
		int index = 0;		

		min = array[0];

		for (int i = 1; i < array.length; i++) {
			
			if (min > array[i]) {
				index = i;
			}

		}	

		return index;
	}
	
	
	
	public static void sortDoubleArray(double[] array) { // Сортировка методом прямого выбора

		int minIndex = 0;		

		for (int i = 0; i < array.length; i++) {
			
			minIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			double temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;

		}	
		
	}
	
	
	public static void printDoubleArray(double[] array) {		

		for (double x : array) {

			System.out.printf("[%.3f] ", x);

		}
		System.out.println();

	}
	
}
