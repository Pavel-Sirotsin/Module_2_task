package by.epam.jonline.task;

import java.util.*;

// 7. Даны действительные числа n a1 a2 a3 .... a(n). Найти max( a1 + a(2*n), a2 + a(2*n-1),..., a(n) + a(n+1)).

public class Array7 {

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
		int max = Integer.MIN_VALUE;

		arr = generateArr(20);

		System.out.println("A new array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i] + arr[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("Changed array: " + Arrays.toString(arr));

		System.out.print("Max value for a given condition = " + max);
	}

}
