package by.epam.jonline.task;

import java.util.*;

// 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class MultiArray13 {

	static int[][] multiArr(int n) {
		Random rand = new Random(8677);
		int[][] arr;

		n = rand.nextInt(n);

		arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
		return arr;
	}

	static void ascendingColumn(int[][] mas) {
		int[] asc;
		asc = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				asc[j] = mas[j][i];
			}

			Arrays.sort(asc);

			for (int k = 0; k < asc.length; k++) {
				mas[k][i] = asc[k];
			}
		}
	}

	static void descendingColumn(int[][] mas) {
		int[] asc;
		asc = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				asc[j] = mas[j][i];
			}

			Arrays.sort(asc);

			for (int k = 0; k < asc.length; k++) {
				mas[k][i] = asc[asc.length - 1 - k];
			}
		}
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] mas;

		mas = multiArr(10);

		System.out.println("A new generated array: ");
		System.out.println();
		printArr(mas);

		ascendingColumn(mas);

		System.out.println("The array with escending elements in column: ");
		System.out.println();
		printArr(mas);

		descendingColumn(mas);

		System.out.println("The array with descending elements in column: ");
		System.out.println();
		printArr(mas);
	}

}
