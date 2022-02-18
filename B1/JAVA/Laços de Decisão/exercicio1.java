package lacosDecisao;

import java.util.Scanner;

/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class exercicio1 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Dite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Dite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Dite o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO primeiro número "+n1+" é maior");
		}else if(n2>n1 && n2>n3) {
			System.out.println("\nO segundo número "+n2+" é maior");
		}else if(n3>n1 && n3>n2) {
			System.out.println("\nO terceiro número correspondente a "+n3+" é maior");
		}
		
		
	}
}
