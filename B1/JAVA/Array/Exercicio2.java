package Exercicios;

import java.util.Scanner;

/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

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
					System.out.println("\nO n�mero Par digitado foi "+numero[x]);
					somaPar+= numero[x];
				}else {
					contImpar++;
					System.out.println("\nO n�mero impar digitado foi "+numero[x]);
				}
		}
		
		System.out.println("\nA soma total dos n�meros pares foi: "+somaPar+"\nO total de n�meros impares digitados foi de: "+contImpar);	
		
		
		
	}

}
