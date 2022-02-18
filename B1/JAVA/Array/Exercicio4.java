package Exercicios;

import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/

public class Exercicio4 {
	
	public static void main(String args[]) {
		
		float[][] array1 = new float[2][2];
		float[][] array2 = new float[2][2];
		float[][] array3 = new float[2][2];
		int linha, coluna, var,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("Entre com os valores do arrey1: ");
				array1[linha][coluna] = leia.nextFloat();
				System.out.println("Entre com os valores do arrey2: ");
				array2[linha][coluna] = leia.nextFloat();
			}
		}
		
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n 1 - Somar as duas matrizes");
			System.out.println("\n 2 - Subtrair a primeira matriz da segunda");
			System.out.println("\n 3 - Adicionar uma variavel as duas matrizes");
			System.out.println("\n 4 - Imprimir as matrizes");
			System.out.println("\n 5 - Sair do programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
							System.out.println("\nSoma :"+ array3[linha][coluna]);
						}
					}
					break;
					
				case 2:
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array3[linha][coluna] = array2[linha][coluna] - array1[linha][coluna];
							System.out.println("\nSubtração :"+ array3[linha][coluna]);
						}
					}
					break;
				case 3:	
					System.out.println("\nEntre com um valor");
					var = leia.nextInt();
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							array1[linha][coluna] = array1[linha][coluna] + var;
							array2[linha][coluna] = array2[linha][coluna] + var;
							System.out.println("\nArray1 :"+ array1[linha][coluna]);
							System.out.println("\nArray2 :"+ array2[linha][coluna]);
						}
					}
					break;
				case 4:
					for(linha=0;linha<2;linha++) {
						for(coluna=0;coluna<2;coluna++) {
							System.out.println("\nVariavel somada ao array1 :"+ array1[linha][coluna]);
							System.out.println("\nVariavel somada ao array2 :"+ array2[linha][coluna]);
						}
					}					
					break;
				case 5:
					System.out.println("\nObrigado por utilizar o sistema");
					break;
				default:
					System.out.println("\nOpção invalida!!!\n\nDigite novamente");			
			}
		}while(op!=5);

		
	}

}
