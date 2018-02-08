package by.htp.homeworkunit2.task03_1;

import java.util.Random;
import java.util.Scanner;

public class MultipleK {

	public static void main(String[] args) {
		int n;
		int k;
		int[] array;
		
		n = readFromConsole("Введите количество элементов массива N -->");
		k = readFromConsole("Введите число K -->");
		array = initIntArray(n);
		printIntArray(array);
		
				
		System.out.println("Сумма элементов массива кратных К равна  " + findSumMultipleK(array, k));
		

	}
	
	
	public static int[] initIntArray(int size) {

		int[] mas = new int[size];

		Random randomGenerator = new Random();		

		for (int i = 0; i < mas.length; i++) {

			mas[i]=randomGenerator.nextInt(100);

		}

		return mas;

	}
	
	public static int readFromConsole(String massage) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.print(massage);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(massage);			
		}
		x =  sc.nextInt();
		
		return x;
	}
	
	
	public static int findSumMultipleK(int[] arr, int n){

		int sum = 0;

		for (int i=0; i<arr.length; i++) {

			if(arr[i] % n == 0) {
				sum += arr[i];
			}

		}

		return sum;

	}
	
	public static void printIntArray(int[] array) {		

		for (int x : array) {

			System.out.printf("[%d ] ", x);

		}
		System.out.println();

	}

}
