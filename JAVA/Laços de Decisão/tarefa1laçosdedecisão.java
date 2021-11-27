package tarefas;

import java.util.Scanner;

public class tarefa1laçosdedecisão {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner leia = new Scanner(System.in); 
			
			System.out.println("\nEntre com o primeiro número: ");
			a = leia.nextInt();
			System.out.println("\nEntre com o segundo número: ");
			b = leia.nextInt();
			System.out.println("\nEntre com o terceiro número: ");
			c = leia.nextInt();
			
			if(a>b && a>c)
			{ 
				System.out.println("\nO maior número é: " + a);
			}
			
			else if(b>a && b>c)
			{
				System.out.println("\nO maior número é: " + b);
			}
			
			else 
			{
				System.out.println("\nO maior número é: " + c);
			}
			
		
		
	}	

}
