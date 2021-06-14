package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class MultiArray3 {

	static int[][] multiGen(int x) {
		Random rand = new Random(194);

		int[][] arr = new int[rand.nextInt(x)][rand.nextInt(x)];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(x + 20);

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr;
		int line = 2;
		int column = 5;

		arr = multiGen(10);
		System.out.println("A new array: " + Arrays.deepToString(arr));

		for (int i = line - 1; i < line; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[line][j] + " ");
			}

		}

		System.out.println(" - the searched string.");

		for (int i = 0; i < arr.length; i++) {
			for (int j = column - 1; j < column; j++) {

				System.out.print(arr[i][column] + " ");
			}
		}

		System.out.println(" - the searched column.");

	}

}
