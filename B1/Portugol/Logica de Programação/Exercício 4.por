programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: 
			
			D = R+S / 2 onde  R =(A+B)^2
						  S = (B+C)^2
		*/

		inteiro A
		inteiro B
		inteiro C
		inteiro R
		inteiro S
		inteiro D

		escreva("O valor de A é: ")
		leia(A)
		escreva("O valor de B é: ")
		leia(B)
		escreva("O valor de C é: ")
		leia(C)

		R = mat.potencia((A+B),2)
		S = mat.potencia((B+C),2)

		 D = (R+S) / 2

		 escreva("O valor de D é: ", mat.arredondar(D,2))
		

		
		


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */