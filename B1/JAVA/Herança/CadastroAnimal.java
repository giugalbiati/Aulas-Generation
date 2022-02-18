package Heranca;

import java.util.Scanner;

public class CadastroAnimal {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String nome="",som="",atividade="";
	int idade=0,digite,digiteNovamente;
	
	System.out.println("\t\tLista dos animais que tratamos"+"\n1 - Cachorro\n2 - Cavalo\n3 - Preguiça");
	digite = leia.nextInt();
	
	
	
	
	switch(digite) {
	 case 1:
		 System.out.println("\n1 - Importar dados do cachorro\n2 - Cadastrar novo cachorro");
		 digiteNovamente = leia.nextInt();
		 
		 if(digiteNovamente == 2) {
		 System.out.println("Nome do animal:");
		 nome = leia.next();
		 System.out.println("Idade do animal: ");
		 idade = leia.nextInt();
		 System.out.println("Altura do som emitido: ");
		 som = leia.next();
		 System.out.println("Atividade do animal");
		 atividade = leia.next();
	
		 Cachorro cachorro = new Cachorro(nome,idade,som,atividade);
		 cachorro.informacaoAnimal();
		 break;
		 }else if(digiteNovamente == 1) {
			 Cachorro cachorro = new Cachorro(nome,idade,som,atividade);
			 cachorro.dadosAnimal();
			 break;
		 }
		 
	 case 2:
		 System.out.println("\n1 - Importar dados do Cavalo\n2 - Cadastrar novo Cavalo");
		 digiteNovamente = leia.nextInt();
		 
		 if(digiteNovamente == 2) {
		 System.out.println("Nome do animal:");
		 nome = leia.next();
		 System.out.println("Idade do animal: ");
		 idade = leia.nextInt();
		 System.out.println("Altura do som emitido: ");
		 som = leia.next();
		 System.out.println("Atividade do animal");
		 atividade = leia.next();
	
		 Cavalo cavalo = new Cavalo(nome,idade,som,atividade);
		 cavalo.informacaoAnimal();
		 break;
		 }else if(digiteNovamente == 1) {
			 Cavalo cavalo = new Cavalo(nome,idade,som,atividade);
			 cavalo.dadosAnimal();
			 break;
		 }
	 case 3:
		 System.out.println("\n1 - Importar dados da Preguiça\n2 - Cadastrar nova Preguiça");
		 digiteNovamente = leia.nextInt();
		 
		 if(digiteNovamente == 2) {
		 System.out.println("Nome do animal:");
		 nome = leia.next();
		 System.out.println("Idade do animal: ");
		 idade = leia.nextInt();
		 System.out.println("Altura do som emitido: ");
		 som = leia.next();
		 System.out.println("Atividade do animal");
		 atividade = leia.next();
	
		 Preguica preguica = new Preguica(nome,idade,som,atividade);
		 preguica.informacaoAnimal();
		 break;
		 }else if(digiteNovamente == 1) {
			 Preguica preguica = new Preguica(nome,idade,som,atividade);
			 preguica.dadosAnimal();
			 break;
		 }
		 
	}
	
	
		

	}

}
