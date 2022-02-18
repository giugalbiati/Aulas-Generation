programa
{
	/*
	Receber valores de base e altura de um triângulo e verificar se são valores válidos
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	*/


	
	funcao inicio()
	{
		inteiro base
		inteiro altura
		inteiro calculo

		escreva("A base do triangulo é: ")
		leia(base)
		escreva("A altura do triangulo é: ")
		leia(altura)

		
		calculo = base*altura / 2
		

			se(calculo > 0){
				escreva("A base e altura é positiva e o caluclo da área é ", calculo)	
				}
 			se (calculo < 0){
			escreva("A base e altura é negativa")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */