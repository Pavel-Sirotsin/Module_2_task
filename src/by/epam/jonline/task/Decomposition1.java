package by.epam.jonline.task;

//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел.

public class Decomposition1 {

	public static void main(String[] args) {

		int x = 5;
		int y = 7;

		if (x == 0 && y == 0) {
			
			System.out.print("Ошибка! Деление на ноль.");
		
		} else {
			
			LcmGcdEuclid(x, y);
			
		}
	}

	public static void LcmGcdEuclid(int a, int b) {

		int gcd;
		gcd = 0;

		int lcm = Math.abs(a * b);

		while (a != 0 && b != 0) {
			
			if (a > b) {
				a %= b;
			} else {	
				
				b %= a;
			}
		}
		
		gcd = a + b;
		
		lcm /= gcd;
		
		System.out.print("НОД: " + gcd + "\nНОК: " + lcm);
	}

}
