package URI.URI1006;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Média 2");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		double media = (A * 2 + B * 3 + C * 5) / 10.0;

		System.out.printf("MEDIA = %.1f%n", media);

		input.close();
	}
}
