package Exercicios;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */

public class exercicio2 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o total de dias vivido: ");
		int totalDias = leia.nextInt();
		
		int anos = totalDias / 365;
		int meses = (totalDias%365) / 30;
		int dias = (totalDias%365) % 30;
		
		System.out.println("O total de anos vividos é " + anos + "\nO total de meses é "  + meses + "\nO total de dias é " + dias);
		
	}
}
