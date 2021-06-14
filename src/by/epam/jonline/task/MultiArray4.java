package by.epam.jonline.task;

import java.util.*;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):[n][n] =  {1,2,3 ...n},{ n, n-1, n-2...1}

public class MultiArray4 {

	static int[][] multiArr(int n) {

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0)
					arr[i][j] = j;
				else
					arr[i][j] = arr[i].length - j;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr;

		arr = multiArr(6);
		
		System.out.println(Arrays.deepToString(arr));

	}

}
