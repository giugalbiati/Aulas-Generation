package lacosDecisao;

import java.util.Scanner;

/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
public class exercicio2 {
	public static void main(String args[]) {
	Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Dite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Dite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Dite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n2>n3) {
			System.out.println("O maior n�mero �: "+n1+"\nO n�mero medio �: "+n2+"\nO menor n�mero �: "+n3);
		}else if(n2>n1 && n1>n3) {
			System.out.println("O maior n�mero �: "+n2+"\nO n�mero medio �: "+n1+"\nO menor n�mero �: "+n3);
		}else if(n3>n1 && n1>n2) {
			System.out.println("O maior n�mero �: "+n3+"\nO n�mero medio �: "+n1+"\nO menor n�mero �: "+n2);
		}
	}
}
