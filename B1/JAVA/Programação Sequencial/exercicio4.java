package Exercicios;

import java.util.Scanner;

/*
 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = R+S/2 , onde R= (A+B)^2 e S=(B+C)^2
 */

public class exercicio4 {

	public static void main(String args[]) {

		double D, R, S;

		Scanner leia = new Scanner(System.in);

		System.out.println("O valor de A é: ");
		double A = leia.nextDouble();
		System.out.println("O valor de B é: ");
		double B = leia.nextDouble();
		System.out.println("O valor de C é: ");
		double C = leia.nextDouble();

		R = Math.pow((A + B), 2);
		System.out.println("O valor de R é: " + R);

		S = Math.pow((B + C), 2);
		System.out.println("\nO valor de S é: " + S);

		D = (R + S) / 2;
		System.out.println("\nO resultado D é: " + D);

	}
}
