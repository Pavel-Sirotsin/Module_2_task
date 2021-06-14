package by.epam.jonline.task;

import java.util.Random;

// 10. Найти положительные элементы главной диагонали квадратной матрицы.

public class MultiArray10 {

	static int[][] multiArr(int n) {
		Random rand = new Random();
		int[][] arr;
		
		arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n - rand.nextInt(10);
			}
		}

		return arr;
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mas;

		System.out.println("A new generated array:");
		mas = multiArr(6);

		printArr(mas);
		System.out.println();

		System.out.println("Positive elements of main diagonal: ");

		for (int i = 0; i < mas.length; i++) {
			int j = i;

			if (mas[i][j] > 0) {
				System.out.print(mas[i][j] + " ");
			}
		}

	}

}
