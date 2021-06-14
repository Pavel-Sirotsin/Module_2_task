package by.epam.jonline.task;

import java.util.*;

// 4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

public class Array4 {

	static int[] generateAr(int x) {
		Random rand = new Random(860707);

		int[] arr = new int[rand.nextInt(x)];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(x + 10);
		}
		return arr;
	}

	static int maxInArr(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	static int minInArr(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;

	}

	public static void main(String[] args) {
		int[] arr;
		int maxVal;
		int minVal;

		arr = generateAr(20);
		System.out.println("A new generated array: " + Arrays.toString(arr));

		maxVal = maxInArr(arr);
		System.out.println("Maximum value of array: " + maxVal);

		minVal = minInArr(arr);
		System.out.println("Minimum value of array: " + minVal);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maxVal)
				arr[i] = minVal;
			else if (arr[i] == minVal)
				arr[i] = maxVal;
		}

		System.out.println("Changed array: " + Arrays.toString(arr));

	}

}
