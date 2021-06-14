package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

public class Array3 {
	static Array3 counter = new Array3();
	int positive = 0;
	int zero = 0;
	int negative = 0;

	static int[] generateArr(int x) {
		Random rand = new Random(1986);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = x - rand.nextInt(2 * x);
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] arr;

		arr = generateArr(20);
		System.out.println("A new generated array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				counter.positive++;
			} else if (arr[i] == 0) {
				counter.zero++;
			} else if (arr[i] < 0) {
				counter.negative++;
			}
		}

		System.out.println("Count of positive elements: " + counter.positive);
		System.out.println("Count of zero elements: " + counter.zero);
		System.out.println("Count of negative elements: " + counter.negative);

	}

}
