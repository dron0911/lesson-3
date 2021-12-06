package com.belhard.lesson3.arrays.sorting;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = com.belhard.lesson3.arrays.onedimentional.Task1.dimensionOfArray(scanner);
		int[] array = com.belhard.lesson3.arrays.onedimentional.Task1.createRandomArray(n);
		com.belhard.lesson3.arrays.onedimentional.Task1.printArray(array);
		int[] sortedArray = bubbleSort(array);
		printSorted(sortedArray);
	}

	public static int[] bubbleSort(int[] array) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			int temp;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return array;
	}

	public static void printSorted(int[] mas) {
		System.out.print("\nBubble sort result : ");
		for (int ma : mas) {
			System.out.print("(" + ma + ") ");
		}
	}
}
