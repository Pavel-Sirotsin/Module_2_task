package by.epam.jonline.task;

public class Decomposition17 {
	public static int generate() {
		int number = 0;
		number = 10 + (int) (Math.random() * 1000);
		System.out.println("Generated number: " + number);
		return number;
	}

	public static int sum(int x) {
		int sum = 0;

		while (x != 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}

	public static void substarction(int x) {
		int count = 0;

		while (x != 0) {
			x -= sum(x);
			count++;
		}
		System.out.println("Amount of times to get 0: " + count);
	}

	public static void main(String[] args) {
		int n = generate();

		substarction(n);

	}

}
