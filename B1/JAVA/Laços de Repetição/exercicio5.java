package lacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */

public class exercicio5 {

	public static void main(String args[]) {

		int somaNumero = 0, numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o n�mero ");
		numero = leia.nextInt();

		do {
			if (numero != 0) {
				somaNumero += numero;
			}
			System.out.println("Entre com o n�mero ");
			numero = leia.nextInt();

		} while (numero > 0);
		somaNumero += numero;

		System.out.println("A soma dos numero informados �: " + somaNumero);

	}

}
