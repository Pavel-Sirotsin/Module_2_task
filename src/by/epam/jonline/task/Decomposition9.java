package by.epam.jonline.task;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

public class Decomposition9 {
	
	public static int generate() {
		int a;
		a = 2 + (int) (Math.random() * 20);
		return a;
	}

	public static double squareT(int x, int y, int z) {
		double s;
		s = (x + z) * y;
		s /= 2;

		return s;
	}

	public static void main(String[] args) {
		int x = generate();
		int y = generate();
		int z = generate();

		System.out.println("X: " + x + " | Y: " + y + " | Z: " + z);
		double STetragon = squareT(x, y, z);

		System.out.println("The square of tetragon is: " + STetragon);

	}

}
