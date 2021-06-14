package by.epam.jonline.task;

// 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
// использовать декомпозицию.

public class Decomposition14 {

	public static int power(int x) {
		int p = 0;
		while (x != 0) {
			x /= 10;
			p++;
		}
		return p;
	}

	public static int sum(int x, int pow) {
		int sum = 0;
		while (x != 0) {
			sum += Math.pow(x % 10, pow);
			x /= 10;
		}
		return sum;
	}

	public static void armstrong(int n) {
		System.out.println("Armstrong numbers from the selected range: 1 - 2000.");
		for (int i = 1; i < n; i++) {

			if (i == sum(i, power(i)))
				System.out.print(i + " | ");

		}

	}

	public static void main(String[] args) {
		int n = 2000;

		armstrong(n);

	}

}
