package lacosDecisao;

import java.util.Scanner;
import java.text.DecimalFormat;


/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

public class exercicio4 {
	public static void main(String[] args) {
		
		DecimalFormat arredondar = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		double numero;
			
		System.out.println("Digite o número: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.println("A raiz quadrada do numero digitado é: "+arredondar.format(numero));
		}else if(numero % 2 != 0) {
			numero = Math.pow(numero,2);
			System.out.println("O numero informado ao quadrado é: "+numero);
		}
	}

}
