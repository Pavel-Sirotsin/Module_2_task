package by.epam.jonline.task;

// 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.*;

public class Decomposition5 {
	
	public static int[] generate(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 50);
		}
		return mas;
	}

	public static int findS(int[] mas) {
		Arrays.sort(mas);
		int p = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < mas[mas.length - 1] && mas[i] > 0)
				p = mas[i];
		}

		return p;
	}

	public static void main(String[] args) {
		int n = 8;
		int[] A = new int[n];
		int penult = 0;

		A = generate(A);
		System.out.println("A new generated array: " + Arrays.toString(A));

		penult = findS(A);

		System.out.print("The second lergest number: " + penult);
	}

}
