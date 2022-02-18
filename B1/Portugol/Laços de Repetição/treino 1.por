programa
{
	
	funcao inicio()
	{
		inteiro num,contPar=0,contImpar=0


		escreva("nÚMERO" )
		leia(num)

		enquanto(num!=0){
			se (num%2==0){
				contPar++ // contPar = contPar + 1
			} senao {
				contImpar++ 
			}
			escreva("entre com número")
			leia(num)
		}

		escreva(" Voce digitou ",contPar)
		escreva(" Voce digitou ",contImpar)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */