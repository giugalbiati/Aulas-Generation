programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		/*
		 O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.
		 */

		real distribuidor
		real impostos
		real custoDaFabrica
		real custoAoConsumidor
		
		impostos = 45.0
		distribuidor = 28.0

		escreva("O custo total da fabrica de carro é de: ")
		leia(custoDaFabrica)

		distribuidor = custoDaFabrica + ( custoDaFabrica*distribuidor/100)

		impostos = custoDaFabrica + (custoDaFabrica*impostos/100)
		
		
		custoAoConsumidor = impostos+distribuidor+custoDaFabrica

		escreva("O costo ao consumidor é de: ", mat.arredondar(custoAoConsumidor,2))
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */