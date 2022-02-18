package lacosDecisao;

import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
public class exercicio2 {
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Dite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Dite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Dite o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n2>n3) {
			System.out.println("O maior número é: "+n1+"\nO número medio é: "+n2+"\nO menor número é: "+n3);
		}else if(n2>n1 && n1>n3) {
			System.out.println("O maior número é: "+n2+"\nO número medio é: "+n1+"\nO menor número é: "+n3);
		}else if(n3>n1 && n1>n2) {
			System.out.println("O maior número é: "+n3+"\nO número medio é: "+n1+"\nO menor número é: "+n2);
		}
	}
}
