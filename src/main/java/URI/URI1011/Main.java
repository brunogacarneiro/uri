package URI.URI1011;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1011 - Esfera");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double raio = input.nextDouble();
		double pi = 3.14159;
		double calculoVolume = 4 / 3.0 * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f%n", calculoVolume);

		input.close();
	}
}
