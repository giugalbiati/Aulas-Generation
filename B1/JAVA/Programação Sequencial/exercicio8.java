package Exercicios;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */

public class exercicio8 {
	
	public static void main(String args[]) {
		
		float custoFabrica,distribuidor= 28,impostos = 45,consumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O custo de f�brica de um carro �: ");
		custoFabrica = leia.nextFloat();
		
		distribuidor = custoFabrica + (custoFabrica*distribuidor/100);
		impostos = custoFabrica + (custoFabrica*impostos/100);
		consumidor = custoFabrica+impostos+distribuidor;
		
		System.out.println("O custo do carro novo pro consumidor � de: R$"+consumidor);
		
		
		
	}

}
