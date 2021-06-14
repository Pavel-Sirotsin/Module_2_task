package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Array1 {

	static int[] generateArr(int x) {
		Random rand = new Random(1986);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 10);
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] arr;
		int k = 3;
		int sum = 0;

		arr = generateArr(15);
		System.out.println("A new generated array: " + Arrays.toString(arr));

		for (int i : arr) {

			if (i % k == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println(" :multiples of K.");
		System.out.println("The sum of the multiples numbers: " + sum);

	}

}
