package Exercicios;

import java.util.Scanner;

/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */
public class Exercicio2 {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero [] = new int[6];
		int somaPar=0, contImpar=0, mostraImpar, mostraPar;
		
		
		for(int x=0;x<6;x++) {
			System.out.println("\nEntre com o numero");
			numero[x] = leia.nextInt();
			
				if(numero[x] % 2 == 0) {	
					System.out.println("\nO número Par digitado foi "+numero[x]);
					somaPar+= numero[x];
				}else {
					contImpar++;
					System.out.println("\nO número impar digitado foi "+numero[x]);
				}
		}
		
		System.out.println("\nA soma total dos números pares foi: "+somaPar+"\nO total de números impares digitados foi de: "+contImpar);	
		
		
		
	}

}
