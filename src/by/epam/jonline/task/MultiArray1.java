package by.epam.jonline.task;

import java.util.*;

// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class MultiArray1 {

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
		int[][] marr = multiGen(10);

		System.out.println("A new multi array: " + Arrays.deepToString(marr));

		for (int i = 0; i < marr.length; i++) {
			for (int j = 1; j < marr[i].length; j += 2) {
				if (marr[0][j] > marr[marr.length - 1][j]) {
					System.out.print(+marr[i][j] + " ");
				}

			}
		}
		System.out.println(" - searched elements.");
	}

}
