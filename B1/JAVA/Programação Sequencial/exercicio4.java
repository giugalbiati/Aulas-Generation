package Exercicios;

import java.util.Scanner;

/*
 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D = R+S/2 , onde R= (A+B)^2 e S=(B+C)^2
 */

public class exercicio4 {

	public static void main(String args[]) {

		double D, R, S;

		Scanner leia = new Scanner(System.in);

		System.out.println("O valor de A �: ");
		double A = leia.nextDouble();
		System.out.println("O valor de B �: ");
		double B = leia.nextDouble();
		System.out.println("O valor de C �: ");
		double C = leia.nextDouble();

		R = Math.pow((A + B), 2);
		System.out.println("O valor de R �: " + R);

		S = Math.pow((B + C), 2);
		System.out.println("\nO valor de S �: " + S);

		D = (R + S) / 2;
		System.out.println("\nO resultado D �: " + D);

	}
}
