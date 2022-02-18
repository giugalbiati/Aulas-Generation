programa
{
	inclua biblioteca Matematica--> mate
	
	funcao inicio()
	{
		real x,y,a,b,c,E,d,f

		escreva("Valor de a: ")
		leia(a)
		escreva("Valor de b: ")
		leia(b)
		escreva("Valor de c: ")
		leia(c)
		escreva("Valor de E: ")
		leia(E)
		escreva("Valor de d: ")
		leia(d)
		escreva("Valor de f: ")
		leia(f)

		x = (c*E - b*f) / (a*E - b*d)
		y = (a*f - c*d) / (a*E - b*d)

		escreva("O valor de X é : ",mate.arredondar(x,2)," e o de y é: ",mate.arredondar(y,2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */