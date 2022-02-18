programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		real d,x1,x2,y1,y2

		escreva("O valor de x1 é: ")
		leia(x1)
		escreva("O valor de x2 é: ")
		leia(x2)
		escreva("O valor de y1 é: ")
		leia(y1)
		escreva("O valor de y2 é: ")
		leia(y2)

		d = mat.raiz(mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2),2)
		
		escreva("O valor de distancia entre os pontos é: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */