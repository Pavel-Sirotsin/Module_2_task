package by.epam.jonline.task;

// 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Decomposition16 {

	public static int length(int x) {
		int count = 0;

		while (x != 0) {
			x /= 10;
			count++;
		}

		return count;
	}

	public static boolean check(int x) {
		int l = length(x);

		int[] mas = new int[l];

		for (int j = mas.length - 1; j >= 0; j--) {

			mas[j] = x % 10;
			if (mas[j] % 2 == 0)
				return false;
			x /= 10;
		}

		return true;
	}

	public static int findNumber(int n) {
		System.out.println("Odd numbers:");
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			if (check(i) == true) {
				sum += i;
				System.out.print(i + " | ");
			}
		}
		return sum;
	}

	public static void checkTheSum(int x) {
		int count = 0;
		int val;

		while (x != 0) {
			val = x % 10;
			if (val % 2 == 0)
				count++;
			x /= 10;
		}
		System.out.print("Amount of even numbers in the summ: " + count);
	}

	public static void main(String[] args) {
		int n = 110;
		int sumOfOdd;

		sumOfOdd = findNumber(n);

		System.out.println();
		System.out.println("The summ of elements with odd numbers: " + sumOfOdd);

		checkTheSum(sumOfOdd);
	}

}