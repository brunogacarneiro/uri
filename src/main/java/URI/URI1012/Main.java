package URI.URI1012;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1012 - Área");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double areaTrianguloRetangulo = a * c / 2;
		double areaCirculo = 3.14159 * Math.pow(c, 2);
		double areaTrapezio = (a + b) * c / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		input.close();
	}
}
