package lacosRepeticao;

import java.util.Scanner;

/*
 *4  - Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 */

public class exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, genero, fp, contpc = 0, contmn = 0, contha = 0, contoc = 0, contpn40 = 0, contpc18 = 0, x = 1;

		while (x <= 5) {
			System.out.println("Entre com a sua idade");
			idade = leia.nextInt();
			while (idade <= 0 || idade >= 125) {
				System.out.println("\nEntre com a sua idade");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com seu genero:\n1- Feminino\n2- Masculino\n3- Outros");
			genero = leia.nextInt();
			while (genero < 1 || genero > 3) {
				System.out.println("\nEntre com seu genero:\n1- Feminino\n2- Masculino\n3- Outros");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com seu fator psicológico: \n1- Calmo\n2- Nervoso\n3- Agressivo");
			fp = leia.nextInt();
			while (fp < 1 || fp > 3) {
				System.out.println("\nEntre com seu fator psicológico: \n1- Calmo\n2- Nervoso\n3- Agressivo");
				fp = leia.nextInt();
			}

			if (fp == 1) {
				contpc++;
			}

			if (genero == 1 && fp == 2) {
				contmn++;
			}
			if (genero == 2 && fp == 3) {
				contha++;
			}
			if (genero == 3 && fp == 1) {
				contoc++;
			}
			if (fp == 2 && idade > 40) {
				contpn40++;
			}
			if (fp == 1 && idade < 18) {
				contpc18++;
			}

			x++;
		}

		System.out.println("\nPessoas calmas: " + contpc);
		System.out.println("\nMulheres nervosas: " + contmn);
		System.out.println("\nHomens agressivos: " + contha);
		System.out.println("\nOutros calmas: " + contoc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: " + contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: " + contpc18);

	}

}
