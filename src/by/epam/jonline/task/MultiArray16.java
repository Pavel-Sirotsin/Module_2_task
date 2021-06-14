package by.epam.jonline.task;

// 16. Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3, n^2

// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
// собой. 
// 
public class MultiArray16 {

	static int[][] siamese(int n) {
		int[][] mas = new int[n][n];
		int line = n - 1;
		int column = n / 2;
		mas[line][column] = 1;

		if (n % 2 == 0) {
			System.out.println("For odd numbers.");
		} else {

			for (int i = 2; i <= n * n; i++) {

				if (mas[(line + 1) % n][(column + 1) % n] == 0) {
					line = (line + 1) % n;
					column = (column + 1) % n;
				} else {
					line = (line - 1 + n) % n;
				}
				mas[line][column] = i;
			}
		}
		return mas;
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] mas = siamese(3);

		printArr(mas);

	}
}
