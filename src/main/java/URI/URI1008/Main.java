package URI.URI1008;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("PROBLEMA: 1008 - Salário");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int numeroFuncionario = input.nextInt();
		int qtdHorasTrabalhadas = input.nextInt();
		double valorHora = input.nextDouble();
		double salario = qtdHorasTrabalhadas * valorHora;

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

	}
}
