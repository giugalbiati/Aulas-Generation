programa
{
	
	funcao inicio()
	{
		/* João, homem de bem, comprou um microcomputador para controlar o rendimento diário
	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
	da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
	ZERO. */
	
		
		real P
		real E
		real M

		
		E = 50
		M =  4.00


		escreva ("Quantos KG de tomates o João trouxe? ")
		leia(P)

		se(P>E){
			M = (4.00 * P) - 200 // 50*4 = 200. Só seria aplicado se ele trouxesse 100kg
			escreva("João irá pagar: ",M," reais de multa")
		}senao se(P<=E){ 
			escreva("João não irá pagar multa")
		}

		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */