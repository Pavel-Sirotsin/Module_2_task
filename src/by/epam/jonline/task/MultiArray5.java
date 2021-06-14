package by.epam.jonline.task;

// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):[n][n] = {1,1,1..1},.., {n,0,0..0}

import java.util.*;

public class MultiArray5 {

	static int[][] multiArr(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				if (j >= arr[i].length - i) {
					arr[i][j] = 0;
				}

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr;

		arr = multiArr(4);

		System.out.println("Searched array: " + Arrays.deepToString(arr));

	}

}
