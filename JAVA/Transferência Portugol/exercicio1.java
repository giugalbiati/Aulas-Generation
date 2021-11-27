package exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int ano,mes,dia,totalDias;
		try (Scanner leia = new Scanner(System.in)) {
		
			System.out.println("\nEntre com a quantidade de anos: "); 
			ano = leia.nextInt();
			System.out.println("\nEntre com a quantidade de meses: "); 
			mes = leia.nextInt();
			System.out.println("\nEntre com a quantidade de dias: "); 
			dia = leia.nextInt();
		} 
		
		totalDias = ano*365 + mes*30 + dia;
		System.out.println("\nVocê viveu: "+totalDias+" dias de vida");


	}

}
