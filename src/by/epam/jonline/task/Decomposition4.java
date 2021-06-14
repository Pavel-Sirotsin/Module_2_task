package by.epam.jonline.task;

import java.util.Arrays;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание: координаты точек занести в массив.

public class Decomposition4 {

	public static double distance(int[] a, int[] b) {
		double dis;

		dis = Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2);
		dis = Math.sqrt(dis);

		return dis;
	}

	public static void fill(char[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (char) (65 + i);
		}
	}

	public static int[] fill() {
		int[] mas = new int[2];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
		}
		return mas;
	}

	public static void count(char[] c) {
		double max = 0;
		double dis = 0;
		int[] xy1;
		int[] xy2;
		
		for (int i = 0; i < c.length; i+=2) {
			
			xy1 = fill();
			xy2 = fill();
			dis = distance(xy1, xy2);
			if(dis > max) max = dis;

			System.out.print(c[i]+ "" + c[i+1]);
			System.out.print(Arrays.toString(xy1));
			System.out.print(Arrays.toString(xy2));

			System.out.printf("  Distance: %.2f \n", dis);
		}
		System.out.printf("The biggest distance: %.2f", max);
	}

	public static void main(String[] args) {
		int countOfDot = 8;

		char[] dot = new char[countOfDot];
		fill(dot);
		count(dot);

	}

}
