package tarefas;

import java.util.Scanner;

public class tarefa3ldd {

	public static void main(String[] args) {
		
		byte idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextByte();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nVocê se encontra na categoria infantil");
		}
		
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nVocê se encontra na categoria juvenil");
		}
		else if(idade>=18 && idade<=25) 
		{
			System.out.println("\nVocê se encontra na categoria adulto");
		}
		else
		{
			System.out.println("\nIdade fora de categoria!");
		}
		

	}

}
