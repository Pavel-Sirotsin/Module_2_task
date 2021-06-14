package by.epam.jonline.task;

import java.util.*;

// 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
// на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.

public class MultiArray8 {
	static Random rand = new Random();
	static int x = rand.nextInt(15);

	static int[][] multiGen() {
		int[][] arr;
		arr = new int[x][x];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}

		return arr;
	}

	static int enterFromConsole(String s) {
		int n;

		System.out.print(s);

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNextInt()) {
			System.out.print("Only numbers from Integer scale >> ");
			in.nextLine();
		}

		n = in.nextInt();

		while (n >= x ^ n < 0) {
			System.out.print("Sorry! Out of bounds or negative value! >> ");
			n = in.nextInt();
		}

		return n;
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mas;
		int[][] masChanged;
		int columnFirst;
		int columnSecond;

		mas = multiGen();
		masChanged = multiGen();

		printArr(mas);
		System.out.println();

		columnFirst = enterFromConsole("Choose first column >> ");

		columnSecond = enterFromConsole("Choose second column >> ");

		for (int i = 0; i < mas.length; i++) {

			masChanged[i][columnFirst] = mas[i][columnSecond];
			masChanged[i][columnSecond] = mas[i][columnFirst];

		}

		System.out.println();
		printArr(masChanged);
		System.out.println();
	}
}