package tarefas;

import java.util.Scanner;

public class tarefa2ldd {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3);
		{
		     if(n2>n3)
		     {
			System.out.println("\nA ordem crescente dos n�meros �: "+n3+" "+n2+" "+n1);
		     }
		     else
		     {
			System.out.println("\nA ordem crescente dos n�meros �: "+n2+" "+n3+" "+n1);
		     }
		}
		else if(n2>n1 && n2>n3);
		{
		     if(n1>n3)
		     {
			System.out.println("\nA ordem crescente dos n�meros �: "+n3+" "+n1+" "+n2);
		     }
		     else
		     {
			System.out.println("\nA ordem crescente dos n�meros �: "+n1+" "+n3+" "+n2);
		     }
		}
		else if(n3>n1 && n3>n2);
		{
		     if(n2>n1)
			 {
				System.out.println("\nA ordem crescente dos n�meros �: "+n1+" "+n2+" "+n3);
			 }
			 else
			 {
				System.out.println("\nA ordem crescente dos n�meros �: "+n2+" "+n1+" "+n3);
			 }
		}


	}

}
