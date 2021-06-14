package by.epam.jonline.task;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Decomposition3 {
	
	public static double squareTriangle(int n) {
		double S;
		
		S = Math.sqrt(3) * Math.pow(n, 2) / 4;
		
		return S;
	}

	public static void main(String[] args) {

		int a = 9;
		
		double hexS = 6 * squareTriangle(a); 

		System.out.printf("Площадь шестиугольника =  %.2f", hexS );

	}

}
