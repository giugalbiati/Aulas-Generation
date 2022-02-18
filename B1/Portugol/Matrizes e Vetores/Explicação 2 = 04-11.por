programa
{
	
	funcao inicio()
	{
		
		inteiro numeros[2][3], somaPar=0,contImpar=0,linha,coluna

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna])
				se(numeros[linha][coluna] % 2 == 0)
				{
					somaPar+=numeros[linha][coluna]
				}
				senao
				{
					contImpar++
				}
			}
		}

		escreva("\nSomatório de número pares: ",somaPar)
		escreva("\nContagem de número impares: ",contImpar)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 7, 10, 7}-{somaPar, 7, 25, 7}-{contImpar, 7, 35, 9}-{linha, 7, 47, 5}-{coluna, 7, 53, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */