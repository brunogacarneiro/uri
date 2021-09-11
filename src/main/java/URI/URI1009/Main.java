package URI.URI1009;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1009 - Salário + Bonus");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String nomeVendedor = input.next();
		double salarioFixo = input.nextDouble();
		double vendasEfetuadas = input.nextDouble();
		double commisao = vendasEfetuadas * 0.15;
		double salarioFinal = salarioFixo + commisao;

		System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
		
		input.close();

	}

}
