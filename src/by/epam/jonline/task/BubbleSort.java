package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 4. Сортировка обменами. Дана последовательность чисел A1 <= A2 <= ...An.Требуется переставить числа в
// порядке возрастания. Для этого сравниваются два соседних числа Ai и Ai+1. Если Ai > Ai+1 , то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class BubbleSort {

	static int[] arrayGen(int x) {
		Random rand = new Random(861);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = x - rand.nextInt(x + 15);
		}
		System.out.println("Generated sequence: " + Arrays.toString(mas));
		return mas;
	}

	static void swap(int[] mas, int i, int j) {
		int temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;
	}

	static void compare(int[] mas) {
		int count = 0;
		boolean isSorted = false;
		int lastUnsorted = mas.length - 1;
		int firstUnsorted = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if (mas[i] > mas[i + 1]) {
					swap(mas, i, i + 1);
					isSorted = false;
					count++;
				}

			}
			// Движение в обратную сторону
			lastUnsorted--;
			for (int i = lastUnsorted; i > firstUnsorted; i--) {
				if (mas[i] < mas[i - 1]) {
					swap(mas, i, i - 1);
					isSorted = false;
					count++;
				}
			}
			firstUnsorted++;
		}
		System.out.println("The sorted array: " + Arrays.toString(mas));
		System.out.print("Amount of replaces: " + count);
	}

	public static void main(String[] args) {
		int[] mas;

		mas = arrayGen(15);

		compare(mas);

	}

}
