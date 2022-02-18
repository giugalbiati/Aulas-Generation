package Exercicios;

import java.util.Arrays;

/*
 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
 *  O programa deve executar os seguintes passos: 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
 * (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 * (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.  
 */

public class Exercicio1 {
	
	public static void main(String args[]) {
		int a[] = new int[] {1, 0, 5, -2, -5, 7};
		int b=0, x=0;
		
		
		//b+=a[0];
		//System.out.println("A soma posição 0 é: "+a[0]);
		b+=a[1];
		System.out.println("A soma posição 0 é: "+a[1]);
		b+=a[5];
		System.out.println("A soma posição 0 é: "+a[5]);
		
		a[4] = 100;
		System.out.println("\nO número no vetor[4] foi alterado de -2 para "+a[4]+"\n");
		
		Arrays.sort(a);
		System.out.println("A ordem do vetor é: ");
		for(int A:a) {
			
			System.out.println(A);
		}


		
	}
	
}
