package by.htp.homeworkunit2.task03_4;

import java.util.Random;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int n;		
		int[] array;
		
		n = readFromConsole("������� ���������� ��������� ������� N -->");
		
		array = initIntArray(n);
		printIntArray(array);
		
		int[] evenArr = arrayOfEven(array);
		
		//printIntArray(evenArr);		
		
		if (evenArr.length != 0) {
			printIntArray(evenArr);
		}
		else {
			System.out.println("������ ����� � ������������������ ���");
		}

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

			mas[i]=randomGenerator.nextInt(1000);

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
	
	public static int[] arrayOfEven(int[] mas) {

		int even = 0;

		for (int x : mas) {
			if (x%2 ==  0) {
				even++;
			}
		}				

		int[] evenArray = new int[even];

		int j=0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i]%2 == 0) {

				evenArray[j] = mas[i];
				j++;

			}
		}

		return evenArray;

	}

}
