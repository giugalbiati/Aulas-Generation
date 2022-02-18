package lacosRepeticao;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

public class exercicio2 {
	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);

		int x, numero, contImpar = 0, contPar = 0;

		for (x = 0; x < 10; x++) {
			System.out.println("Digito o número");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}

		System.out.println("O total de número pares é: " + contPar + "\n e o total de número impares é: " + contImpar);
	}

}
