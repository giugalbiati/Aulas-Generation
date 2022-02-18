package Heranca;

public abstract class Animal {
	
	private String tipoAnimal;

	abstract public void som(String som);
	abstract public void idade(int idade);
	abstract public void nome(String nome);	
	
	
	public Animal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
}
