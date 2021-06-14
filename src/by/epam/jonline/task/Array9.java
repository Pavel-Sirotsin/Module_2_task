package by.epam.jonline.task;

import java.util.*;

// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
// чисел несколько, то определить наименьшее из них.

public class Array9 {

	static int[] generator(int x) {
		Random rand = new Random();
		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 20);
		}
		Arrays.sort(mas);

		return mas;
	}

	static void findMinDuplicate(int[] mas) {
		int counter = 0;

		for (int i = 0; i < mas.length - 1; i++) {

			if (mas[i] == mas[i + 1]) {
				counter++;
				System.out.println(mas[i]);
				break;
			}
		}
		if (counter == 0)
			System.out.print("There is no matches.");
	}

	public static void main(String[] args) {
		int mas[];

		mas = generator(30);

		System.out.println("A new generated array: " + Arrays.toString(mas));

		System.out.print("Min value among duplicate elements: ");

		findMinDuplicate(mas);

	}
}
