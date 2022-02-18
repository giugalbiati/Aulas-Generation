package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String args[]) {
		
		int op;

		Scanner leia = new Scanner(System.in);
		
		ArrayList estoque = new ArrayList();
		ArrayList contProduto = new ArrayList();
		
		
		do {
			
			System.out.println("Controle de estoque");
			System.out.println("________________________________________________________________________________");
			System.out.println("\n1 - Adicionar um novo produto ao estoque");
			System.out.println("\n2 - Remover um produto do estoque");
			System.out.println("\n3 - Alterar produto já  cadastrado");
			System.out.println("\n4 - Mostrar o estoque o e total armazenado");
			System.out.println("\n0 - Encerrar o sistema");			
			System.out.println("________________________________________________________________________________");
			System.out.println("\nDigite o número correspondente as opções");			
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					leia.nextLine();
					
					System.out.println("Total de unidades adicionados ao estoque");
					int cont = leia.nextInt();
					estoque.add("Carlos");
					contProduto.add(4);
					System.out.println(estoque+""+contProduto);
					
					break;
				case 2:
					leia.nextLine();
					System.out.println("\nDigite o prouto para remover do estoque: ");
					String produtor = leia.nextLine();
					if (estoque.contains(produtor)) {
						estoque.remove(produtor);
					} else {
						System.out.println("\nProduto não encontrado!!");
					}
					break;
				case 3:
					leia.nextLine();
					System.out.println("\nDigite o produto que deseja atualizar");
					String verifica = leia.nextLine();
					System.out.println("\nDigite o nome do produto que entrará no lugar do produto: " + verifica + " : ");
					String novo = leia.nextLine();
					System.out.println("Total de unidades adicionados ao estoque");
					cont = leia.nextInt();
					if (estoque.contains(verifica)) {
						estoque.remove(verifica);
						estoque.add(novo);
						contProduto.add(cont);
					} else {
						System.out.println("\nProduto não encontrado!!");
					}
					System.out.println("\n" + estoque);
					break;
				case 4:
					System.out.println("\nOs produtos que está no estque: \n" + estoque+" "+contProduto);
					break;
				default:
					System.out.println("\nFinalizou o programa");
			}
			
		}while(op!=0);
			
			
		
		
		
	}

}
