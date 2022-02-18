package Heranca;

public class Cachorro extends Animal {
	
	
	public Cachorro() {
		super("Animal Cachorro");
	}
	
	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do Cachorro "+nomeAnimal);
	}
	
	
	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade do Cachorro "+idadeAnimal);
	}
	
	
	@Override
	public void som(String somAnimal) {
		System.out.println("\nSom do Cachorro "+somAnimal);
	}
	
	public void Corre() {
		System.out.println("\nUma das características do cachorro é correr!!");
	}
	
	
	}



