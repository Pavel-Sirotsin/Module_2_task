package by.epam.jonline.task;

// 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

import java.util.Arrays;

public class Decomposition8 {

	public static int[] generate(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 20);
		}
		return mas;
	}

	public static void countOf3(int[] mas, int step) {
		int sum;
		int range = 0;

		while (step != 0) {
			sum = 0;
			for (int j = range; j < range + 3; j++) {

				sum += mas[j];
			}
			System.out.println("The sum of elements from " + (range + 1) + " to " + (range + 3) + " is: " + sum);
			step--;
			range += step;

		}
	}

	public static void main(String[] args) {
		int n = 6;
		int step = 3;
		int[] D = new int[n];

		D = generate(D);
		System.out.println(Arrays.toString(D));

		countOf3(D,step);

	}

}
