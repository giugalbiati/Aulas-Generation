package tarefas;

import java.util.Scanner;

public class tarefa6ldr {

	public static void main(String args[]) {
		 
		int n = 0, s =0, cont = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			if(n % 3 == 0) {
				s += n;
				cont++;
			}
			
			System.out.println("Insira um n�mero: ");
			n = leia.nextInt();
			
		}while (! (n == 0) );
		
		if(cont > 1) {
			cont -=1;
		}
		
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + (s / cont));
		
		leia.close();
	}

	}

