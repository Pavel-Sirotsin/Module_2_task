package by.epam.jonline.task;

import java.util.Random;

// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class MultiArray15 {

	static int[][] multiArr(int n) {
		System.out.println("Genereated array: ");
		System.out.println();
		Random rand = new Random();
		int[][] arr;

		arr = new int[rand.nextInt(n)][rand.nextInt(n)];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(n + 5);
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

	static void maxChangeOdd(int[][] mas) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] > max)
					max = mas[i][j];
			}
		}

		System.out.println("Max value among elements: " + max);
		System.out.println();

		System.out.println("The array with replaced odd numbers: ");
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 == 1)
					mas[i][j] = max;
			}
		}
	}

	public static void main(String[] args) {
		int[][] mas;

		mas = multiArr(10);

		printArr(mas);

		maxChangeOdd(mas);

		printArr(mas);

	}

}
