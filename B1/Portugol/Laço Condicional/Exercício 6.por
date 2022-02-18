programa
{
	/*
	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
	*/
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a idade: ")
		leia(idade)
		se(idade>=18){
			escreva ("O nadador irá competir na classificação de adulto")
		} senao se(idade>=14 e idade<18)	{
			escreva ("O nadador irá competir na classificação de juvenil B")
		} senao se(idade>=12 e idade<=13)	{
			escreva ("O nadador irá competir na classificação de juvenil A")
		} senao se(idade>=8 e idade<=11)	{
			escreva ("O nadador irá competir na classificação de infantil A")
		} senao se(idade>=5 e idade<=7) {
			escreva ("O nadador irá competir na classificação de infantil B")
		} senao se(idade<5){
			escreva ("A criança não possui idade para competir")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 706; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */