package Exercicios;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */

public class exercicio8 {
	
	public static void main(String args[]) {
		
		float custoFabrica,distribuidor= 28,impostos = 45,consumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O custo de fábrica de um carro é: ");
		custoFabrica = leia.nextFloat();
		
		distribuidor = custoFabrica + (custoFabrica*distribuidor/100);
		impostos = custoFabrica + (custoFabrica*impostos/100);
		consumidor = custoFabrica+impostos+distribuidor;
		
		System.out.println("O custo do carro novo pro consumidor é de: R$"+consumidor);
		
		
		
	}

}
