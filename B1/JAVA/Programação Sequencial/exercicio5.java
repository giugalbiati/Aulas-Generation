package Exercicios;

import java.util.Scanner;

/*
 * 5 - Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

public class exercicio5 {

	public static void main(String[] args) {
			
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1*2+n2*3+n3*5) / 10;
		
		System.out.println("\nA m�dia �: " + media);
		
	}

}
