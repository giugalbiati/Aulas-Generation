package lacosRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

public class exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, somaNumero = 0, somaMedia = 0, media;

		System.out.println("Entre com o n�mero ");
		numero = leia.nextInt();

		do {
			if (numero % 3 == 0) {
				somaMedia++;
				somaNumero += numero;
			}

			System.out.println("Entre com o n�mero ");
			numero = leia.nextInt();

		} while (numero % 3 < 0);

		media = somaNumero / somaMedia;

		System.out.println("A media dos n�mero multiplos por tr�s �  " + media);

	}

}
