package Exercicios;

import java.util.Scanner;

/*
 * 3 - Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class exercicio3 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quanto tempo irá durar o evento da fábrica? ");
		int segundos = leia.nextInt();
		System.out.println("O evento ira durar " + segundos + " segundos.");
		
		int hora = segundos/3600;
		int minutos = (segundos/3600) % 60;
		segundos = (segundos%3600) % 60;
		
		System.out.println("Ou seja o evento irá durar " + hora + " horas, " + minutos + " minutos e " + segundos + " segundos." );
		
		
	}
}
