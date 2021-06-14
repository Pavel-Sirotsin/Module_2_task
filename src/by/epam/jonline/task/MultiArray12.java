package by.epam.jonline.task;

import java.util.*;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class MultiArray12 {

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

	static void ascendingLines(int[][] mas) {
		int[] asc;
		asc = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				asc[j] = mas[i][j];
			}
			
			Arrays.sort(asc);

			for (int k = 0; k < asc.length; k++) {
				mas[i][k] = asc[k];
			}
		}
	}

	static void descendingLines(int[][] mas) {
		int[] asc;
		asc = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				asc[j] = mas[i][j];
			}
			
			Arrays.sort(asc);

			for (int k = 0; k < asc.length; k++) {
				mas[i][k] = asc[asc.length - 1 - k];
			}
		}
	}

	public static void main(String[] args) {
		int[][] mas;

		mas = multiArr(10);

		System.out.println("A new generated array: " + Arrays.deepToString(mas));
		System.out.println();

		ascendingLines(mas);

		System.out.println("The array with escending elements: " + Arrays.deepToString(mas));
		System.out.println();

		descendingLines(mas);

		System.out.println("The array with descending elements: " + Arrays.deepToString(mas));

	}
}
