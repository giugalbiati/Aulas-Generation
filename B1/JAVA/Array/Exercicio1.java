package Exercicios;

import java.util.Arrays;

/*
 * 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
 *  O programa deve executar os seguintes passos: 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
 * (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 * (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.  
 */

public class Exercicio1 {
	
	public static void main(String args[]) {
		int a[] = new int[] {1, 0, 5, -2, -5, 7};
		int b=0, x=0;
		
		
		//b+=a[0];
		//System.out.println("A soma posi��o 0 �: "+a[0]);
		b+=a[1];
		System.out.println("A soma posi��o 0 �: "+a[1]);
		b+=a[5];
		System.out.println("A soma posi��o 0 �: "+a[5]);
		
		a[4] = 100;
		System.out.println("\nO n�mero no vetor[4] foi alterado de -2 para "+a[4]+"\n");
		
		Arrays.sort(a);
		System.out.println("A ordem do vetor �: ");
		for(int A:a) {
			
			System.out.println(A);
		}


		
	}
	
}
