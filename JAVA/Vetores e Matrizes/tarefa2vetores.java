package tarefas;

import java.util.Scanner;

public class tarefa2vetores {

	public static void main(String[] args) {
	
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.*/
		
		int [] n=new int [6];
		int x,somap=0,somai=0;
				
		Scanner leia = new Scanner(System.in);
		for (x=0;x<6;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			n[x] = leia.nextInt();
			
		}
		
		System.out.println("\nValores pares: ");
		
		for (x=0;x<6;x++)
		{
			if (n[x] %2==0)
			{
				System.out.println("\n"+n[x]);
				somap=somap+n[x];
			}
			
		}
		
		System.out.println("\nA soma dos n�meros pares � igual a: "+somap);
		
System.out.println("\nValores impares: ");
		
		for (x=0;x<6;x++)
		{
			if (n[x] %2==1)
			{
				System.out.println("\n"+n[x]);
				somai=somai+n[x];
			}
			
		}
		
		System.out.println("\nA soma dos n�meros �mpares � igual a: "+somai);
		
		


	}

}
