package tarefas;

import java.util.Scanner;

public class tarefa3matrizes {

	public static void main(String[] args) {
		
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
		
		int [][]n=new int [3][3];
		int x,l,c,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		 for (l=0;l<3;l++)
		 {
			 for (c=0;c<3;c++)
			 {
				 System.out.println("\nInsira um número: ");
				 n[l][c] = leia.nextInt();
				 
			 }
		 }
		 
		 System.out.println("\nValores maiores que 10: ");
		 
		 for (l=0;l<3;l++)
		 {
			 for (c=0;c<3;c++)
			 {
				 if(n[l][c]>10)
				 {
					 System.out.println("\n" + n[l][c]);
					 cont++;
				 }
				
			 }
		 }
		 
		 System.out.println("\nTotal de números maiores que 10 foi de: " + cont);
		 
	

	}

}
