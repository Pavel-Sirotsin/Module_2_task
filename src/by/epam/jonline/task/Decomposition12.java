package by.epam.jonline.task;

import java.util.Arrays;

// 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
// являются числа, сумма цифр которых равна К и которые не большее N.

public class Decomposition12 {

	public static int findNumber(int k, int n) {
		int number = 0;
		int sum = 0;

		while (sum != k) {
			number = 1 + (int) (Math.random() * n);
			sum = count(number);
		}
		return number;
	}

	public static int count(int x) {
		int sum = 0;
		while (x != 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}

	public static int[] fill(int[] arr) {
		int k;
		k = 1 + (int) (Math.random() * 18);

		int n;
		n = 3 * k + (int) (Math.random() * 100);

		System.out.println("Generated numbers K and N: " + k + " | " + n);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = findNumber(k, n);
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] A = new int[3];

		fill(A);

		System.out.print("A array: " + Arrays.toString(A));
	}

}
