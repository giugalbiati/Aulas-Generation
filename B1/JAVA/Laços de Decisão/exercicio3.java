package lacosDecisao;

import java.util.Scanner;

/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

public class exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int competidor;
		
		System.out.println("Entre com a idade do competidor: ");
		competidor = leia.nextInt();
		
		if(competidor>=10 && competidor<=14) {
			System.out.println("Competidor irá competir na categoria infantil");
		}else if(competidor>=15 && competidor<=17) {
			System.out.println("Competidor irá competir na categoria juvenil");
		}else if(competidor>=18) {
			System.out.println("Competidor irá competir na categoria adulto");
		}else if(competidor<10) {
			System.out.println("Competidor não possui idade competir");
		}
		

	}
}
