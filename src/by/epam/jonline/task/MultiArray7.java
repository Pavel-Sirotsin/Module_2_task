package by.epam.jonline.task;

import java.util.Arrays;

// 7. Сформировать квадратную матрицу порядка N по правилу: A[i,j] = sin((I^2 - J^2) / N).
// и подсчитать количество положительных элементов в ней.

public class MultiArray7 {

	static double[][] multiArr(int n) {

		double[][] arr;

		arr = new double[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (Math.pow(i, 2) - Math.pow(j, 2)) / n;
				arr[i][j] = Math.sin(arr[i][j]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int sumPositive = 0;
		double[][] mas;

		mas = multiArr(5);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {

				if (mas[i][j] > 0)
					sumPositive++;
			}
		}

		System.out.println("The amount of positive elements: " + sumPositive);

		System.out.print("A sought-for array: " + Arrays.deepToString(mas));

	}

}
