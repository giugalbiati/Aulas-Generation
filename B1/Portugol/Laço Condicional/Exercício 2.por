programa
{

/*
 Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
	
	funcao inicio()
	{
		real C
		real N 
		real salario
		real horaExtra
		real salarioTotal

		escreva("Digite o código do operário: ")
		leia(C)

		escreva("Digite o total de horas que ele trabalhou: ")
		leia(N)


		se(N> 50){

			salario = (N-1)*10
			horaExtra = (N-50)*20 + salario
			

			escreva("O seu salário é de: R$",salario)
			escreva("\nO condigo do operário é: ",C)
			escreva("\nO seu salário com hora extra é R$",horaExtra)
		} senao {
			salario = N*10
			horaExtra = 0

			escreva("O seu salário é de: R$",salario)
			escreva("\nO condigo do operário é: ",C)
			escreva("\nO seu salário com hora extra é R$",horaExtra)

			
		}
		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 757; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */