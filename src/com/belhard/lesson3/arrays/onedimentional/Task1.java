package com.belhard.lesson3.arrays.onedimentional;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = dimensionOfArray(scanner);
		int[] array = createRandomArray(n);
		printArray(array);
		sumOfElementsMultiplesK(array, scanner);
	}

	public static int dimensionOfArray(Scanner scanner) throws Exception {
		System.out.print("Enter array dimension N: ");
		int n = intValue(scanner);
		System.out.println();
		if (n <= 0) {
			throw new Exception("N should be more than 0");
		} else {
			return n;
		}
	}

	public static int intValue(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.print("Error! Invalid data type. Enter value of (int) : ");
			scanner.next();
		}
		int value = scanner.nextInt();
		return value;
	}

	public static int[] createRandomArray(int n) {
		Random random = new Random();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		return array;
	}

	public static void printArray(int[] array) {
		System.out.print("Array : ");
		for (int mass : array) {
			System.out.print("(" + mass + ") ");
		}
		System.out.println();
	}

	public static void sumOfElementsMultiplesK(int[] array, Scanner scanner) {
		System.out.print("\nEnter K: ");
		int k = intValue(scanner);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}
		System.out.print("\nSum of elements that is multiples K is equals  : " + sum);
	}
}
