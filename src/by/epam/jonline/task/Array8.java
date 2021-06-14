package by.epam.jonline.task;

import java.util.*;

// 8. Дана последовательность целых чисел a(1), a(2) ... a(n). Образовать новую последовательность, выбросив из
// исходной те члены, которые равны min( a(1), a(2) ... a(n)).

public class Array8 {

	static int[] arrGen(int x) {
		Random rand = new Random();
		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 10);
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] arr;
		int min = Integer.MAX_VALUE;
		
		arr = arrGen(20);

		System.out.println("A new array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min)
				arr[i] = 0;
		}

		System.out.println("Changed array: " + Arrays.toString(arr));
	}

}
