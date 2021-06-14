package by.epam.jonline.task;

import java.util.*;

// 3. Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
// элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
// повторяется. Написать алгоритм сортировки выбором.

public class SelectionSort {
	
	static int[] arrayGen(int x) {
		Random rand = new Random(899);

		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = x - rand.nextInt(x + 15);
		}
		System.out.println("A new generated sequence: " + Arrays.toString(mas));
		return mas;
	}

	public static void swap(int[] mas, int i, int j) {
		int temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;

	}
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i+1; j < arr.length-1; j++) {
			    if (arr[j] > arr[max]) {
					max = j;
				}
			}
			   if(i != max) swap(arr, i, max);
		}
	}

	public static void main(String[] args) {
		int[] mas;
		mas = arrayGen(15);
		
		sort(mas);
		System.out.print(Arrays.toString(mas));
	}
}
