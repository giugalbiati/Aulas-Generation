programa
{
	inclua biblioteca Util-->u

/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
 */
	
	funcao inicio()
	{
		inteiro dado[10],valorDado=0,somaDados=0,x,valorAlto=0,valorMedio=0,valorBaixo=0
		real mediaDados

		para(x=0;x<10;x++)
		{
			valorDado = u.sorteia(1,6)

			somaDados+= valorDado
			
			dado[x] = valorDado

			se(valorDado>4)
			{
				//valores entre 5 e 6
				valorAlto++
			}
			senao se(valorDado>2 e valorDado<4)
			{
				//valores entre 3 e 4
				valorMedio++
			}
			senao
			{
				//valores entre 1 e 2
				valorBaixo++
			}
			
		}

		//Acumula o valor de daos em cada jogada
		para (x=0;x<10;x++)
		{
		escreva("\nDado ",x+1," valor de: ",dado[x])
		}
		
		mediaDados = somaDados / 10

		escreva("\n\nOs total de valor alto é: ",valorAlto)
		escreva("\nOs total de valor medio é: ",valorMedio)
		escreva("\nOs total de valor baixo é: ",valorBaixo)
		escreva("\n\nA média aritimética entre os dados é: ",mediaDados)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 979; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 14, 10, 4}-{valorDado, 14, 19, 9}-{somaDados, 14, 31, 9}-{x, 14, 43, 1}-{valorAlto, 14, 45, 9}-{valorMedio, 14, 57, 10}-{valorBaixo, 14, 70, 10}-{mediaDados, 15, 7, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */