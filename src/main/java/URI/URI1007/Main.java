package URI.URI1007;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1007 - Diferença");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();

		int diferenca = (A * B) - (C * D);

		System.out.println("DIFERENCA = " + diferenca);

		input.close();
	}

}
