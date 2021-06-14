package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а(n) > i.

public class Array5 {
	static int[] arr;

	static int[] generateArr(int x) {
		Random rand = new Random(190707);

		int[] arr = new int[rand.nextInt(x)];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = x - rand.nextInt(2 * x);
		}
		return arr;
	}

	public static void main(String[] args) {
		arr = generateArr(20);

		System.out.println("A new array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i)
				System.out.print(arr[i] + " ");
		}
		System.out.println(" - the numbers bigger than 'i'.");
	}

}
