package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class MultiArray2 {

	static int[][] multiGen(int x) {
		Random rand = new Random(194);

		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(x + 20);

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr;

		arr = multiGen(10);

		System.out.println("A new generated array: " + Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < i + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println(" - the sought-for diagonal numbers.");
	}

}
