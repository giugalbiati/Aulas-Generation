programa
{
	/*
	 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
	   for maior que 100, caso contrário imprimi-la com o valor zero.
	 */
	
	funcao inicio()
	{
			inteiro N

			escreva("Digite o número de N: ")
			leia(N)

			se(N >=100){
				escreva("O número de N é: ",N)
			}senao se(N != 100) {
				N = 0
				escreva("O valor de N é: ", N)
			}
			 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */