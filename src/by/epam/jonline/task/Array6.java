package by.epam.jonline.task;

import java.util.*;

// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

public class Array6 {

	static int[] generateArr(int x) {
		Random rand = new Random(19877);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = x - rand.nextInt(2 * x);
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] arr;
		int counter;
		int sum = 0;

		arr = generateArr(15);

		System.out.println("Anew array: " + Arrays.toString(arr) + ".");

		for (int i = 0; i < arr.length; i++) {
			counter = 0;

			for (int j = 1; j < 100; j++) {

				if (i % j == 0)
					counter++;
			}

			if (counter <= 2)
				sum += arr[i];
		}

		System.out.print("The sum of sougth-for elements = " + (arr[0] + sum) + ".");
	}

}
