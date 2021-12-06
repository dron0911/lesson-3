package com.belhard.lesson3.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task3 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[] array = Task1.createRandomArray(n);
		int min = findMin(array);
		int[] array2 = new int[n];

		Task1.printArray(array);
		newArrayWithoutMin(array, array2, min);

	}

	public static int findMin(int[] array) {
		int min = array[0];
		for (int mas : array) {
			if (min > mas) {
				min = mas;
			}
		}
		return min;
	}

	public static void newArrayWithoutMin(int[] array, int[] array2, int min) {
		System.out.print("\nArray without min element : ");
		int j = 0;
		for (int mas : array) {
			if (mas != min) {
				array2[j++] = mas;
				System.out.print("(" + mas + ") ");
			}
		}
	}
}
