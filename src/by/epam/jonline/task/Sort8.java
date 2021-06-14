package by.epam.jonline.task;

import java.util.Arrays;

// 8.Даны дроби p1/q1 , p2/q2 ..., pn/qn (qi, pi - натуральные). Составить программу, которая приводит эти дроби к общему
// знаменателю и упорядочивает их в порядке возрастания.

public class Sort8 {

	public static String[] fill(int lcm, int[] num, int[] den) {
		String[] string = new String[den.length];
		int[] mas = new int[den.length];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (num[i] * lcm / den[i]);
		}
		Arrays.sort(mas);

		for (int j = 0; j < string.length; j++) {
			string[j] = mas[j] + "/" + lcm;
		}

		return string;
	}

	public static int findLcm(int[] q) {
		int[] mas = new int[q.length - 1];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = lcm(q[i], q[i + 1], gcd(q[i], q[i + 1]));
		}
		int n = mas.length - 1;

		while (n > 0) {
			for (int i = 0; i < n; i++) {
				mas[i] = lcm(mas[i], mas[i + 1], gcd(mas[i], mas[i + 1]));
			}
			n--;

		}

		return mas[0];
	}

	public static int gcd(int a, int b) {
		int gcd;

		while (a != 0 && b != 0) {

			if (a > b) {
				a %= b;
			} else {

				b %= a;
			}
		}
		gcd = a + b;

		return gcd;

	}

	public static int lcm(int a, int b, int gcd) {
		int lcm;

		lcm = Math.abs(a * b);
		lcm /= gcd;

		return lcm;

	}

	public static void main(String[] args) {
		int[] p = { 2, 3, 4, 1, 5 };
		int[] q = { 5, 7, 3, 4, 2 };
		String[] fraction = new String[q.length];

		int lcm;

		lcm = findLcm(q);

		fraction = fill(lcm, p, q);

		System.out.print("Sorted fractions with common denominator: " + Arrays.toString(fraction));
	}

}
