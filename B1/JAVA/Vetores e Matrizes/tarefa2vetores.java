package tarefas;

import java.util.Scanner;

public class tarefa2vetores {

	public static void main(String[] args) {
	
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.*/
		
		int [] n=new int [6];
		int x,somap=0,somai=0;
				
		Scanner leia = new Scanner(System.in);
		for (x=0;x<6;x++)
		{
			System.out.println("\nInsira um número: ");
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
		
		System.out.println("\nA soma dos números pares é igual a: "+somap);
		
System.out.println("\nValores impares: ");
		
		for (x=0;x<6;x++)
		{
			if (n[x] %2==1)
			{
				System.out.println("\n"+n[x]);
				somai=somai+n[x];
			}
			
		}
		
		System.out.println("\nA soma dos números ímpares é igual a: "+somai);
		
		


	}

}
