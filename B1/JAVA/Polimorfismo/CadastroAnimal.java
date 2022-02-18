package Heranca;

import java.util.Scanner;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x=0;
		
		do {
			System.out.println("\nQual o tipo do seu animal?\n\n1 - Cachorro | 2 - Cavalo | 3 - Pregui�a");
			x= leia.nextInt();
			if(x==1) {
				animal = cachorro;
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.next();
				System.out.println("Qual a idade do cachorro?");
				int idade = leia.nextInt();
				System.out.println("\nQual o som que seu cachorro emite?");
				String som = leia.next();
				System.out.println("__________________________________");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
				cachorro.Corre();
				
			}else if(x==2) {
				animal = cavalo;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.next();
				System.out.println("Qual a idade do cavalo?");
				int idade = leia.nextInt();
				System.out.println("\nQual o som que seu cavalo emite?");
				String som = leia.next();
				System.out.println("__________________________________");
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				cavalo.Corre();
				
			}else if(x== 3) {
				animal = preguica;
				System.out.println("\nQual o nome da sua pregui�a?");
				String nome = leia.next();
				System.out.println("Qual a idade da pregui�a?");
				int idade = leia.nextInt();
				System.out.println("\nQual o som que sua pregui�a emite?");
				String som = leia.next();
				System.out.println("__________________________________");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
				preguica.SubirArvores();
			}else {
				System.out.println("\nInforma��o invalida");
			}
		}while(x<=0 || x>=4);
	}

}
