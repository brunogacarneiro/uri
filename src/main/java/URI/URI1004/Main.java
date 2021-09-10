package URI.URI1004;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Produto Simples");
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();

		int PROD = A * B;

		System.out.println("PROD = " + PROD);

		input.close();

	}
}
