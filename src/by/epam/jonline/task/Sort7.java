package by.epam.jonline.task;

import java.util.Arrays;

// 7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= an и b1 <= b2 <= bm. 
// Требуется указать те места, на которые нужно вставлять элементы последовательности bm в первую
// последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Sort7 {
	public static int[] gen(int x) {
		int[] mas = new int[x];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 30);
		}
		return mas;
	}
	
	public static void position(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " \t Index: ");

			int lowIndex = 0;
			int highIndex = a.length;
			int key = b[i];
			int middle = 0;

			while (lowIndex < highIndex) {
				middle = lowIndex + (highIndex - lowIndex) / 2;

				if (key > a[middle]) {
					lowIndex = middle + 1;
				} else {
					highIndex = middle;
				}
			}
			System.out.print(middle + "| ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] a;
		int[] b;
		a = gen(10);
		Arrays.sort(a);

		System.out.println("First sorted sequences: " + Arrays.toString(a));

		b = gen(10);
		Arrays.sort(b);

		System.out.println("Second sorted sequences: " + Arrays.toString(b));

		System.out.println("Numbers:");
		position(a, b);

	}
}
