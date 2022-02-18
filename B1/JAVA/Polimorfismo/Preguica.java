package Heranca;

public class Preguica extends Animal {
	
	
	public Preguica() {
		super("Animal Preguica");
	}
	
	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do Preguica "+nomeAnimal);
	}
	
	
	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade do Preguica "+idadeAnimal);
	}
	
	
	@Override
	public void som(String somAnimal) {
		System.out.println("\nSom da Preguica "+somAnimal);
	}
	
	public void SubirArvores() {
		System.out.println("\nUma das características da preguiça é subir arvores!!");
	}
}
	
	
	

