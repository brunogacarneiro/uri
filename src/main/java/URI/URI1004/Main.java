package URI.URI1004;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        input.close();

    }
}
