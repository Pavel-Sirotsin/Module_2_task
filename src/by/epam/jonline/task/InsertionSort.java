package by.epam.jonline.task;

import java.util.*;

// 5. Сортировка вставками. Дана последовательность чисел A1, A2, ... An. Требуется переставить числа в порядке
// возрастания. Делается это следующим образом. Пусть A1, A2, ... Ai - упорядоченная последовательность, т. е.
// A1 <= A2 <= ... An. Берется следующее число Ai+1 и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
// не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
// с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class InsertionSort {

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
		int key = mas[i];
		mas[i] = mas[j];
		mas[j] = key;
	}

	public static void binarySort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int lowIndex = 0; // задаем диапазон для поиска в отсартированной части
			int highIndex = i;//
			int key = arr[i];// выбираем элемент с которым будем сравнивать нашу середину
			int middle = 0; // середина отсартированной части

			while (lowIndex < highIndex) {
				middle = lowIndex + (highIndex - lowIndex) / 2;//вычисляем середину для нового диапазона каждой итерации

				if (key > arr[middle]) {
					lowIndex = middle + 1; // ищем место в правой части 
				} else {
					highIndex = middle;// иначе в левой
				}
			}
//			System.arraycopy(arr, lowIndex, arr, lowIndex + 1, i - lowIndex);
//			arr[lowIndex] = key;
			while(i > lowIndex) {
				swap(arr, i , lowIndex);
				lowIndex++;
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] mas;
		
		mas = arrayGen(15);
		
		binarySort(mas);

		System.out.println(Arrays.toString(mas));
	}

}
