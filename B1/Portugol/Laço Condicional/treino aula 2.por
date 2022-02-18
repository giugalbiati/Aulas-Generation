programa
{
	
	funcao inicio()
	{
		real numero1,numero2,resultado
		inteiro op

		escreva("Digite o primeiro número ")
		leia(numero1)
		escreva("Digite segundo número ")
		leia(numero2)

		escreva("\n\t\tMenu de ospções")
		escreva("\n1 - soma")
		escreva("\n2 - diiferença")
		escreva("\n3 - multiplicação")
		escreva("\n4 - divisão")
		escreva("\nEscolha a sua opção: ")
		leia(op)

		escolha(op){
			caso 1:
				resultado = numero1 + numero2
				escreva("\n Soma: ", resultado)
			pare
			caso 2:
				resultado = numero1 - numero2
				escreva("\n Diferença: ", resultado)
			pare
			caso 3:
				resultado = numero1 * numero2
				escreva("\n Multiplicação: ", resultado )
			pare
			caso 4:
				se(numero2 == 0){
					escreva("Opção errada ")
				} senao {
				resultado = numero1 / numero2
				escreva("\n Divisão: ",resultado)
				}
			pare
			caso contrario:
			escreva("\n Opção invalida!!")
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */