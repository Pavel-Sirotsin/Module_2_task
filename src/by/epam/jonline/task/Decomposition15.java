package by.epam.jonline.task;

// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Decomposition15 {

	public static int length(int x) {
		int count = 0;

		while (x != 0) {
			x /= 10;
			count++;
		}

		return count;
	}

	public static int[] decompose(int x) {
		int l = length(x);

		int[] mas = new int[l];

		for (int j = mas.length - 1; j >= 0; j--) {

			mas[j] = x % 10;
			x /= 10;
		}
		return mas;
	}

	public static boolean check(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != 1) {
				return false;
			}
		}
		return true;
	}

	public static void findNumber(int n) {
		System.out.println("Numbers with strictly ascending sequence:");
		int[] d;
		boolean c;

		for (int i = 10; i < n; i++) {
			d = decompose(i);
			c = check(d);
			if (c == true)
				System.out.print(i + " | ");

		}

	}

	public static void main(String[] args) {
		int n = 1000;

		findNumber(n);

	}

}
