programa
{
	inclua biblioteca Matematica-->M
	/*
	Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/

	
	funcao inicio()
	{

		real numero1
		real numero2
		real numero3
		real numero4

		escreva("Digite o primeiro número: ")
		leia(numero1)
		escreva("Digite o segundo número: ")
		leia(numero2)
		escreva("Digite o terceiro número: ")
		leia(numero3)
		escreva("Digite o quarto número: ")
		leia(numero4)


		numero1 = M.potencia(numero1,2)
		numero2 = M.potencia(numero2,2)
		numero3 = M.potencia(numero3,2)
		numero4 = M.potencia(numero4,2)

		se(numero3 >=1000) {
			escreva("O valor do terceiro número é ",numero3)
		} senao{
			escreva("\nO valor do primeiro número é ",numero1)
			escreva("\nO valor do segundo número é ",numero2)
			escreva("\nO valor do terceiro número é ",numero3)
			escreva("\nO valor do quarto número é ",numero4)
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 830; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */