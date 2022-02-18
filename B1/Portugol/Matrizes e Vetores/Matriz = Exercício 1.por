programa
{
	inclua biblioteca Util-->u

/*
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.
 */
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna,x

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
				{
				n1[linha][coluna] = u.sorteia(1, 10)
				n2[linha][coluna] = u.sorteia(1, 10)

				m1[linha][coluna]= n1[linha][coluna] + n2[linha][coluna]
				m2[linha][coluna]= n1[linha][coluna] - n2[linha][coluna]
				}
		} 

	/*		// ----------------------------- A M1
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				m1[linha][coluna]= n1[linha][coluna] + n2[linha][coluna]
			}

		}

			// ----------------------------- B M2
			
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				m2[linha][coluna]= n1[linha][coluna] - n2[linha][coluna]
			}

		}

			//------------------ Resultado m1

				para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("Matriz M1: ","[",m1[linha][coluna],"]","\n")
			}

       	}   */	
			
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nSoma: ",m1[linha][coluna],"\nSubtração: ",m2[linha][coluna])
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 15, 10, 2}-{n2, 15, 20, 2}-{m1, 15, 30, 2}-{m2, 15, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */