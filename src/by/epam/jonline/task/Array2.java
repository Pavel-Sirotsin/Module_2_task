package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 2. Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.

public class Array2 {
	static int counter = 0;

	static int[] generateArr(int x) {
		Random rand = new Random(1986);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 10);
		}
		return mas;
	}

	public static void main(String[] args) {
		int[] mas;
		int z = 8;

		mas = generateArr(15);
		System.out.println("Сгенерированный массив: " + Arrays.toString(mas));

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > z) {
				mas[i] = z;
				counter++;

			}
		}

		System.out.println("Массив с замененными элементами : " + Arrays.toString(mas));
		System.out.print("Количество заменённых элементов массива: " + counter);

	}

}
