package exercício7;

import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
	
		int a,b,c,d,e,f,x,y;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com o valor de A: ");
			a = leia.nextInt();
			System.out.println("\nEntre com o valor de B: ");
			b = leia.nextInt();
			System.out.println("\nEntre com o valor de C: ");
			c = leia.nextInt();
			System.out.println("\nEntre com o valor de D: ");
			d = leia.nextInt();
			System.out.println("\nEntre com o valor de E: ");
			e = leia.nextInt();
			System.out.println("\nEntre com o valor de F: ");
			f = leia.nextInt();
		}

		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);

				System.out.println("\nO valor de x foi de: " + x);
				System.out.println("\nO valor de y foi de: " + y);
		

	}

}
