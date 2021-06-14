package by.epam.jonline.task;

import java.util.*;

// 2. Даны две последовательности A1<= A2 <=... An и B1 <= B2 <=...Bn. Образовать из них новую последовательность
// чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Sort2 {

	public static void main(String[] args) {
		int[] seqA = new int[10];
		int lenA = seqA.length;

		int[] seqB = new int[8];
		int lenB = seqB.length;

		for (int i = 0; i < lenA; i++) {
			seqA[i] = (int) Math.pow(2, i) + (2 * i);
		}

		for (int i = 0; i < lenB; i++) {
			seqB[i] = 1 + 4 * i + i / 2;
		}

		System.out.println("First sequence: " + Arrays.toString(seqA));
		System.out.println("Second sequence: " + Arrays.toString(seqB));
		System.out.println();

		for (int i = 0; i < lenB; i++) {
			seqB[i] = seqA[i] * seqB[i];
		}
		
		System.out.println("Sequence created from first and second: " + Arrays.toString(seqB));
	}

}
