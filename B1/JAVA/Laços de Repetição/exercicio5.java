package lacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */

public class exercicio5 {

	public static void main(String args[]) {

		int somaNumero = 0, numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o número ");
		numero = leia.nextInt();

		do {
			if (numero != 0) {
				somaNumero += numero;
			}
			System.out.println("Entre com o número ");
			numero = leia.nextInt();

		} while (numero > 0);
		somaNumero += numero;

		System.out.println("A soma dos numero informados é: " + somaNumero);

	}

}
