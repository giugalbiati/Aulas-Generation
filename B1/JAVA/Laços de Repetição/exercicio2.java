package lacosRepeticao;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

public class exercicio2 {
	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);

		int x, numero, contImpar = 0, contPar = 0;

		for (x = 0; x < 10; x++) {
			System.out.println("Digito o n�mero");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}

		System.out.println("O total de n�mero pares �: " + contPar + "\n e o total de n�mero impares �: " + contImpar);
	}

}
