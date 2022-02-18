package Poo1;

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */

public class Aviao {
	
	
	//declarando atributos da classe Aviao
	private String modelo;
	private String cor;
	private int velocidadeMax;
	private int numTripulantes;
	
	
	
	//declarando construtor
	
	public Aviao() {
		
	}
	
	public Aviao(String modelo, String cor,int velocidadeMax, int numTripulantes) {
		this.modelo = modelo;
		this.cor = cor;
		this.velocidadeMax = velocidadeMax;
		this.numTripulantes = numTripulantes;
	}
	
	
	
	
	public void dadosAviao() {
		System.out.println("\nModelo: "+modelo+"\nCor: "+cor+"\nA velocidade maxima � de: "+velocidadeMax+"\nN�mero de trip: "+numTripulantes);
	}

	
	//GET and SET
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public int getNumTripulantes() {
		return numTripulantes;
	}

	public void setNumTripulantes(int numTripulantes) {
		this.numTripulantes = numTripulantes;
	}
	
	
	
	

}
