package com.belhard.lesson3.arrays.onedimentional;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = Task1.dimensionOfArray(scanner);
		double[] array = createRandomArray(n);
		printArray(array);
		printCount(array);
	}

	public static double[] createRandomArray(int n) {
		Random random = new Random();
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			// array[i] = random.nextDouble() * 1 - 0.5;
			array[i] = Math.random() * 0.1 - 0.05;

		}
		return array;
	}

	public static void printArray(double[] array) {
		System.out.print("Array : ");
		for (double mass : array) {
			System.out.printf("(%.2f) ", mass);
		}
		System.out.println();
	}

	public static void printCount(double[] array) {
		int[] result = new int[] { 0, 0, 0 };

		for (double mass : array) {
			if (mass < 0) {
				result[0]++;
			} else if (mass == 0) {
				result[1]++;
			} else if(mass>0){
				result[2]++;
			}
		}

		System.out.println("Отрицательных элементов: " + result[0]);
		System.out.println("Равных нулю элементов: " + result[1]);
		System.out.println("Положительных элементов: " + result[2]);
	}
}
