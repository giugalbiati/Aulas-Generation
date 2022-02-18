package Exercicios;

import java.util.Scanner;

/*
 * Um sistema de equações lineares do tipo:
 * ax +  by = c
 * dx + ey = f
 * 
, pode ser resolvido segundo mostrado abaixo :

 x = ce - bf / ae - bd
 
 y = af - cd / ae - bd 

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */

public class exercicio7 {

	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,d,e,f;
		float x,y;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
		System.out.println("Digite o valor de d: ");
		d = leia.nextInt();
		System.out.println("Digite o valor de e: ");
		e = leia.nextInt();
		System.out.println("Digite o valor de f: ");
		f = leia.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("O valor de x é: " + x + "\nO valor de y é: " + y);
		
	}
}
