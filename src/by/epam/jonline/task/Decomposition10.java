package by.epam.jonline.task;

import java.util.Arrays;

// 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
// являются цифры числа N.

public class Decomposition10 {

	public static int generate() {
		int a;
		a = 10 + (int) (Math.random() * 10) * (int) (Math.random() * 100) * (int) (Math.random() * 1000);
		return a;
	}

	public static int lengthN(int x) {
		int count = 0;

		while (x != 0) {
			x /= 10;
			count++;
		}
		return count;
	}

	public static int[] fill(int[] arr, int number) {
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = number % 10;
			number /= 10;
		}
		return arr;
	}

	public static void main(String[] args) {
		int N;
		N = generate();
		System.out.println("Generated number: " + N);

		int n;
		n = lengthN(N);
		System.out.println("Length of future array: " + n);

		int[] masN = new int[n];
		fill(masN, N);

		System.out.print(Arrays.toString(masN));
	}

}
