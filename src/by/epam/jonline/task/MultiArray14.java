package by.epam.jonline.task;

import java.util.*;

// 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
// единиц равно номеру столбца.

public class MultiArray14 {

	static int[][] multiArr(int x) {
		Random rand = new Random(1986);
		int[][] arr;
		int m;
		int n;

		n = rand.nextInt(x);
		m = n - 1;

		arr = new int[m][n];

		for (int i = 0; i < arr.length + 1; i++) {

			for (int j = 0; j < i; j++) {
				arr[j][i] = 1;
			}
		}
		return arr;
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
		int mas[][];

		mas = multiArr(10);

		printArr(mas);

	}

}
