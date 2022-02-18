package lacosDecisao;

import java.util.Scanner;
import java.text.DecimalFormat;


/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

public class exercicio4 {
	public static void main(String[] args) {
		
		DecimalFormat arredondar = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		double numero;
			
		System.out.println("Digite o n�mero: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.println("A raiz quadrada do numero digitado �: "+arredondar.format(numero));
		}else if(numero % 2 != 0) {
			numero = Math.pow(numero,2);
			System.out.println("O numero informado ao quadrado �: "+numero);
		}
	}

}
