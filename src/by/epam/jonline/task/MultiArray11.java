package by.epam.jonline.task;

import java.util.Random;

// 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
// которых число 5 встречается три и более раз.

public class MultiArray11 {

	static int[][] multiArr() {
		Random rand = new Random();
		int[][] arr;

		arr = new int[10][20];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(15);
			}
		}

		return arr;
	}

	static void printArr(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" : line " + i);
		}
	}

	public static void main(String[] args) {
		int[][] mas;
		int counter = 0;
		int noMatch = 0;
		mas = multiArr();

		System.out.println("A new generated array: ");
		System.out.println();

		printArr(mas);
		System.out.println();
		System.out.println("Lines with three and more numbers 5: ");

		for (int i = 0; i < mas.length; i++) {
			counter = 0;

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5)
					counter++;
			}
			if (counter >= 3)
				System.out.print(i + "  ");
			else if (counter < 3)
				noMatch++;
		}
		if (noMatch == 10)
			System.out.println("There are no matches!");
	}
}
