package by.epam.jonline.task;

import java.util.*;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Decomposition2 {

	public static int findGcd(int[] n) {
		int[] mas = new int[n.length - 1];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = gcd(n[i], n[i + 1]);
		}
		int l = mas.length - 1;

		while (l > 0) {
			for (int i = 0; i < l; i++) {
				mas[i] = gcd(mas[i], mas[i + 1]);
			}
			l--;

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

	public static void main(String args[]) {
		int[] numbers = { 78, 92, 1000, 364 };
		int gcdF;
		int gcdS;
		
		gcdF = findGcd(numbers);
		
		System.out.println("Euclid: " + gcdF);

		
		gcdS = gcdBruteForce(numbers);
		
		System.out.print("Brute Force: " + gcdS);
		

	}

	public static int gcdBruteForce(int[] mas) {
		int gcd = 1;
		Arrays.sort(mas);
		
		for (int i = 1; i <= mas[0]; i++) {
			if (mas[0] % i == 0 && mas[1] % i == 0 && mas[2] % i == 0 && mas[3] % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
