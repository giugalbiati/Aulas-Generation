package Exercicios;

import java.util.Scanner;

/*
 * 3 - Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class exercicio3 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quanto tempo ir� durar o evento da f�brica? ");
		int segundos = leia.nextInt();
		System.out.println("O evento ira durar " + segundos + " segundos.");
		
		int hora = segundos/3600;
		int minutos = (segundos/3600) % 60;
		segundos = (segundos%3600) % 60;
		
		System.out.println("Ou seja o evento ir� durar " + hora + " horas, " + minutos + " minutos e " + segundos + " segundos." );
		
		
	}
}
