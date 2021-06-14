package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Random;

// 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Array10 {

	static int[] arrayGen(int x) {
		Random rand = new Random();
		int[] mas = new int[rand.nextInt(x)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(x + 10);
		}
		Arrays.sort(mas);

		return mas;
	}

	public static void main(String[] args) {

		int[] array = arrayGen(30);
		
		System.out.println("A random array: " + Arrays.toString(array));
		
		for (int i = 1; i < array.length; i+=2) {
			array[i]= 0;
		}
		System.out.print("Compressed array: " + Arrays.toString(array));

	}

}
