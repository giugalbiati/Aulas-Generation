package lacosRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

public class exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, somaNumero = 0, somaMedia = 0, media;

		System.out.println("Entre com o número ");
		numero = leia.nextInt();

		do {
			if (numero % 3 == 0) {
				somaMedia++;
				somaNumero += numero;
			}

			System.out.println("Entre com o número ");
			numero = leia.nextInt();

		} while (numero % 3 < 0);

		media = somaNumero / somaMedia;

		System.out.println("A media dos número multiplos por trés é  " + media);

	}

}
