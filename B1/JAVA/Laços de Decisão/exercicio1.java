package lacosDecisao;

import java.util.Scanner;

/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class exercicio1 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Dite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Dite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Dite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO primeiro n�mero "+n1+" � maior");
		}else if(n2>n1 && n2>n3) {
			System.out.println("\nO segundo n�mero "+n2+" � maior");
		}else if(n3>n1 && n3>n2) {
			System.out.println("\nO terceiro n�mero correspondente a "+n3+" � maior");
		}
		
		
	}
}
