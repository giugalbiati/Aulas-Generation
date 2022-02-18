programa
{
	inclua biblioteca Util-->u
	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
	 */
	funcao inicio()
	{

		
		inteiro linha, coluna, matriz[3][3],somaMatriz = 0, somaDiagonal = 0


		//Distribui os numeros na matriz
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				matriz[linha][coluna] = u.sorteia(1,10)
			}
		}
		//Soma o total da matriz
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{

				somaMatriz+= matriz[linha][coluna]
			}
		}
			somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
			escreva("A soma total da matriz é: ",somaMatriz)
			escreva("\nA soma em diagonal é: ",somaDiagonal)
			 
			
		/*para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[1][1] 
			}
		}

		
		escreva("\nA soma em diagonal é: ",somaDiagonal)
		*/
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 13, 25, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */