package by.epam.jonline.task;

import java.util.*;

// 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
// один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
// дополнительный массив.

public class Sort1 {

	static int[] arrayGen(int x) {
		Random rand = new Random(122);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 10);
		}
		return mas;
	}

	static public void insertion(int[] masTo, int lengthMasTo, int[] masFrom, int lengthMasFrom, int loc) {
		for (int i = 0; i < lengthMasTo - lengthMasFrom - loc; i++) {
			masTo[loc + lengthMasFrom + i] = masTo[loc + i];
		}

		for (int i = 0; i < lengthMasFrom; i++) {
			masTo[loc + i] = masFrom[i];
		}
		System.out.println("Insertion: " + Arrays.toString(masTo));
	}

	public static void main(String[] args) {
		int[] arrFirst;
		int[] arrSecond;
		int k = 20;
		int len1, len2;
		int loc1;
		int loc2;

		arrFirst = arrayGen(20);

		len1 = arrFirst.length;

		loc1 = k - len1;

		loc2 = (k + 1) - len1;

		arrSecond = arrayGen(10);

		len2 = arrSecond.length;

		System.out.println("First generated array: " + Arrays.toString(arrFirst));
		System.out.println("Location between: " + loc1 + ":" + loc2);
		System.out.println("Second generated array: " + Arrays.toString(arrSecond));
		System.out.println();

		insertion(arrFirst, len1, arrSecond, len2, loc2);

	}

}
