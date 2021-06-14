package by.epam.jonline.task;

// 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
// решения задачи использовать декомпозицию.

import java.util.Arrays;

public class Decomposition13 {

	public static int generate() {
		int number = 0;
		number = 2 + (int) (Math.random() * 50);
		return number;
	}

	public static int[] fill(int[] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
			n += 2;
		}

		return arr;
	}

	public static void main(String[] args) {
		int n;
		n = generate();
		System.out.println("Range between " + n + " and " + 2 * n + ":");

		int[] mas = new int[n / 2 + 1];

		fill(mas, n);

		System.out.print("Twins: " + Arrays.toString(mas));
	}

}
