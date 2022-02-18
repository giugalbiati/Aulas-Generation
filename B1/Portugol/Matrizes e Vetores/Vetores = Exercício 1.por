programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Util
	/*
	1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/
	
	
	funcao inicio()
	{
		inteiro pontuacao=0,maiorPontuacao=0,x,total[5]

		para(x=0;x<5;x++)
		{
			escreva("\nInsira a pontuação: ")
			leia(pontuacao)

			//Irá guardar as pontuações
			total[x] = pontuacao 

			//Conterá a maior pontuação
			se(pontuacao>maiorPontuacao)
			{
				maiorPontuacao = pontuacao
			}			

		}

			limpa()

		//Aprestenta as pontuações
		para(x=0;x<5;x++)
		{
			escreva("\nA pontuação da atividade ",x+1," é: ",total[x]) 
			
		}

		escreva("\n\n\t\tA maior pontuação é: ",maiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 13, 11, 9}-{maiorPontuacao, 13, 23, 14}-{x, 13, 40, 1}-{total, 13, 42, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */