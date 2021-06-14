package by.epam.jonline.task;

import java.util.Arrays;

// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Decomposition6 {

	static int range = 10;
	static int n = 3;

	public static int[] generate(int[] mas, int r) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 2 + (int) (Math.random() * r);
		}
		return mas;
	}

	public static boolean sieveEra(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int k = 2; k * k <= range; k++) {
				for (int j = k * k; j <= range; j += k) {
					if (a[i] == j)
						return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] A = new int[n];
		boolean isPrime = false;

		A = generate(A, range);
		System.out.println(Arrays.toString(A));

		isPrime = sieveEra(A);
		System.out.print("Are all numbers prime? : " + isPrime);
	}

}
