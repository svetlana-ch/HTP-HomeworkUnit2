package by.htp.homeworkunit2.task03_2;

import java.util.Random;
import java.util.Scanner;

public class ZeroArray {

	public static void main(String[] args) {
		int n;		
		int[] array;
		
		n = readFromConsole("¬ведите количество элементов массива N -->");
		
		array = initIntArray(n);
		printIntArray(array);
		
		int[] indexZero = ArrayOfZeroIndex(array);
		
		printIntArray(indexZero);		

	}
	
	
	public static void printIntArray(int[] array) {		

		for (int x : array) {

			System.out.printf("[%d ] ", x);

		}
		System.out.println();

	}
	
	public static int[] initIntArray(int size) {

		int[] mas = new int[size];

		Random randomGenerator = new Random();		

		for (int i = 0; i < mas.length; i++) {

			mas[i]=randomGenerator.nextInt(10);

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
	
	public static int[] ArrayOfZeroIndex(int[] mas) {

		int zeros = 0;

		for (int x : mas) {
			if (x == 0) {
				zeros++;
			}
		}				

		int[] zeroIndex = new int[zeros];

		int j=0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {

				zeroIndex[j] = i;
				j++;

			}
		}

		return zeroIndex;

	}

}
