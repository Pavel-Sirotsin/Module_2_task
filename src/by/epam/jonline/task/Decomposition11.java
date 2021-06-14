package by.epam.jonline.task;

// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Decomposition11 {
	
	public static int generate() {
		int a;
		a = (int) (Math.random() * 10) * (int) (Math.random() * 100);
		return a;
	}

	public static int countNumbers(int x) {
		int count = 0;

		while (x != 0) {
			x /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int a;
		int b;
		a = generate();
		b = generate();

		System.out.println("Generated numbers: " + a + " | " + b);

		int amountOfa = countNumbers(a);
		int amountOfb = countNumbers(b);

		if (amountOfa > amountOfb)
			System.out.println("Number A win: " + amountOfa);
		else if (amountOfa == amountOfb)
			System.out.println("The same: " + amountOfa + " | " + amountOfb);
		else
			System.out.println("Number B win: " + amountOfb);

	}

}
