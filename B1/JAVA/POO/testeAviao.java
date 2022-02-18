package Poo1;

import java.util.Random;
import java.util.Scanner;

public class MainAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random rand = new Random();
		
		int numHangares = 5;
		String lerModelo, lerCor;
		
		
		/*
		 * dicas de nomes de aviões
		  	Boeing 747-8.
			Airbus A380. ...
			Boeing 777. ...
			Airbus A350. ...
			Airbus A340. ...
			Airbus A330. ...
			Embraer E-195. ...
			Bombardier CRJ900. ...
		 */
		
		Aviao[] hangar = new Aviao[numHangares];
		

		
		for(int i=0;i<hangar.length;i++) {
			int numPassageiros = rand.nextInt(300)+100;
			int velocidade  = rand.nextInt(1000)+300;
			hangar[i] = new Aviao();
			System.out.println("Qual o modelo do avião?");
			lerModelo =  leia.nextLine();
			hangar[i].setModelo(lerModelo);
			System.out.println("Qual a cor?");
			lerCor = leia.nextLine();
			hangar[i].setCor(lerCor);
			hangar[i].setVelocidadeMax(velocidade);
			hangar[i].setNumTripulantes(numPassageiros);
		}
			
		for(int i=0;i<hangar.length;i++) {
			hangar[i].dadosAviao();
		}
				
	}

}
