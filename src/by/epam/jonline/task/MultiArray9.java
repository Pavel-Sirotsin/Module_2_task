package by.epam.jonline.task;

import java.util.*;

// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
// столбец содержит максимальную сумму.

public class MultiArray9 {

	static int[][] multiGen(int n) {
		Random rand = new Random();
		int[][] arr;
		arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}

		return arr;
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mas = multiGen(5);
		int sum;
		int max = Integer.MIN_VALUE;

		printArr(mas);
		System.out.println();

		for (int j = 0; j < mas.length; j++) {
			sum = 0;
			
			for (int i = 0; i < mas.length; i++) {
				sum += mas[i][j];
			}
			
			if (sum > max) {
				max = sum;
			}
			
			System.out.println("Sum of a column " + j + " = " + sum);
		}

		System.out.println();
		System.out.println("Max value of sums = " + max);
	}

}
