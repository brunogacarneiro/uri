package URI.URI1003;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Soma Simples");
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();

		int SOMA = A + B;

		System.out.println("SOMA = " + SOMA);

		input.close();

	}
}
