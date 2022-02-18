package lacosRepeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

public class exercicio3 {

	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);

		int idade, cont21 = 0, cont50 = 0;

		System.out.println("\nDigite sua idade:");
		idade = leia.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
			System.out.println("\nDigite sua idade:");
			idade = leia.nextInt();
		}

		System.out.println("\nTemos: " + cont21 + " pessoas com menos de 21 anos");
		System.out.println("\nTemos: " + cont50 + " pessoas com mais de 50 anos");

	}

}
