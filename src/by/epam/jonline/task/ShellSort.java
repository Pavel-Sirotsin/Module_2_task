package by.epam.jonline.task;

// 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai + 1. Если ai <= ai + 1, то продвигаются
// на один элемент вперед. Если ai > ai + 1, то производится перестановка и сдвигаются на один элемент назад.
// Составить алгоритм этой сортировки.

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
	
	static int[] arrayGen(int x) {
		Random rand = new Random(89);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = x - rand.nextInt(x + 15);
		}
		System.out.println("A new generated sequence: " + Arrays.toString(mas));
		return mas;
	}

	public static void swap(int[] mas, int i, int j) {
		int temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;

	}

	public static void sort(int[] arr) {

		int step = arr.length / 2;

		while (step >= 1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i - step; j >= 0; j -= step) {
					if (arr[j] > arr[j + step]) {
						swap(arr, j, j + step);
					}

				}
			}
			step /= 2;
		}
	}

	public static void main(String[] args) {
		int[] mas;
		mas = arrayGen(10);
		sort(mas);

		System.out.print(Arrays.toString(mas));
	}
}
