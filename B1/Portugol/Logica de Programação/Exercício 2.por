programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro dias
		inteiro meses
		inteiro anos
		inteiro diasVividos

		escreva("\n Quantos dias você viveu? ")
		leia(diasVividos)
		anos = diasVividos/365
		meses = (diasVividos % 365) / 30
		dias = (diasVividos % 365) % 30
		
		
		escreva("\n Voce tem ",anos," anos,",meses," meses e ",dias, " dias.")
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */