package URI.URI1013;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1013 - Área");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int maiorAB = (a + b + Math.abs(a - b)) / 2;

		int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.println(maiorABC + " eh o maior");

		input.close();
	}
}
