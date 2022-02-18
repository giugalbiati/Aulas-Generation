package Exercicios;

import java.util.Scanner;

/*
 * 1 - Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 meses e dias e mostre-a expressa apenas em dias.
 */

public class Exercico1 {
	
public static void main(String[] args) {
		
		
		int totalDias = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o número de idade: ");
		int anos = leia.nextInt();
		
		System.out.println("Entre com o número de meses: ");
		int meses = leia.nextInt();
		
		System.out.println("Entre com o número de dias: ");
		int dias = leia.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		totalDias = anos + meses + dias;
		
		System.out.println("O Total de dias vividos é: " + totalDias);
		
		

	}

}
