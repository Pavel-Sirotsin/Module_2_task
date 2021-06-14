package by.epam.jonline.task;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Decomposition7 {

	public static int factorial(int sum, int r) {
		for (int i = 2; i < r; i++) {
			if (i % 2 != 0) {
				int m = 1;
				for (int j = 1; j <= i; j++) {
					m *= j;
				}
				sum += m;

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int range = 10;
		int sum = 0;

		sum = factorial(sum, range);

		System.out.print("The sum of factorials of all odd numbers from 1 to 9 is: " + sum);
	}

}
