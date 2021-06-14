package by.epam.jonline.task;

import java.util.Arrays;

// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class MultiArray6 {

	static int[][] multiArr(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
				if (j >= arr.length - i & j >= arr.length / 2 + (i - 2)) {
					arr[i][j] = 0;
				} else if (j < i & j < arr.length / 2 - (i - 2))
					arr[i][j] = 0;

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr;

		arr = multiArr(6);

		System.out.println("Searched array: " + Arrays.deepToString(arr));
	}

}
