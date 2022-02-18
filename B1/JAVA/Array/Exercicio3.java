package Exercicios;

import java.util.Scanner;

/*
 *	3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

public class Exercicio3 {

	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int x,y=0, conta10=0, numero;
		// x = linha e y = coluna
		
		
		for(x=0;x<3;x++) {	
		
			for(y=0;y<3;y++) {
				System.out.println("\nEntre com o número:");
				matriz[x][y] = leia.nextInt();
			}
		}	
		
		for(x=0;x<3;x++) {				
			for(y=0;y<3;y++) {
				if(matriz[x][y]>10) {
					conta10++;
				}
			}	
		}
		System.out.println("O total de números maior que 10 é "+conta10);
	}
}
