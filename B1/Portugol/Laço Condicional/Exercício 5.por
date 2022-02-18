programa
{
	/*
	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
	medido e emita a notificação adequada aos diferentes grupos de empresas.
	*/
	
	funcao inicio()
	{
		real poluicao
		real empresa1
		real empresa2
		real empresa3

		escreva("Qual o indice da empresa 1? ")
		leia(empresa1)
		escreva("Qual o indice da empresa 2? ")
		leia(empresa2)
		escreva("Qual o indice da empresa 3? ")
		leia(empresa3)

		poluicao = (empresa1+empresa2+empresa3) / 3

			se(poluicao > 0.5){
				escreva("O total de poluição é ",poluicao, " e todas as empresas devem ser interrompidas temporáriamente")
			} senao se(poluicao > 0.4){
				escreva("O total de poluição é ",poluicao," duas empresas irão ser interrompidas temporáriamente") 
			} senao se(poluicao > 0.3){
				escreva("O total de poluição é ",poluicao," somente uma empresa sera interrompida")
			}senao se(poluicao < 0.3){
				escreva("O total de poluição é ",poluicao," todas as empresas podem operar normalmente")
			}
		
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */