package tarefas;

import java.util.Scanner;

public class tarefa1la�osdedecis�o {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner leia = new Scanner(System.in); 
			
			System.out.println("\nEntre com o primeiro n�mero: ");
			a = leia.nextInt();
			System.out.println("\nEntre com o segundo n�mero: ");
			b = leia.nextInt();
			System.out.println("\nEntre com o terceiro n�mero: ");
			c = leia.nextInt();
			
			if(a>b && a>c)
			{ 
				System.out.println("\nO maior n�mero �: " + a);
			}
			
			else if(b>a && b>c)
			{
				System.out.println("\nO maior n�mero �: " + b);
			}
			
			else 
			{
				System.out.println("\nO maior n�mero �: " + c);
			}
			
		
		
	}	

}
