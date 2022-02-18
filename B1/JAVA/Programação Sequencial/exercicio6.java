package Exercicios;

import java.util.Scanner;

/*
 * Construa um programa em Java que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: D = sqrt((x2-x1)^2) + (y2-y1)^2)
 */
public class exercicio6 {
	
	public static void main(String args[]) {
			
		int x1,x2,y1,y2;
		float D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x1: ");
		x1 = leia.nextInt();
		
		System.out.println("\nEntre com o valor de x2: ");
		x2 = leia.nextInt();
		
		System.out.println("\nEntre com o valor de y1: ");
		y1 = leia.nextInt();
		
		System.out.println("\nEntre com o valor de y2: ");
		y2 = leia.nextInt();
		
		D = (float) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
		
		System.out.println("O valor de D é: "+ D);		

	}
}
