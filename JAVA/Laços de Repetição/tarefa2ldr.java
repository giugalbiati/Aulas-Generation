package tarefas;

import java.util.Scanner;

public class tarefa2ldr {

public static void main(String[] args) {
		
		int n, p = 0, i = 0;
		Scanner leia = new Scanner(System.in);
		
		
		for (int x = 0; x < 10; x++) {
			
			System.out.println("Insira um número: ");
			n = leia.nextInt();
			
			if (n % 2 == 0) {
				p++;
			}
			else {
				i++;
			}
		}
		
		System.out.println("Número de pares: " + p + " e de impares: " + i);
		
		leia.close();
}

}
