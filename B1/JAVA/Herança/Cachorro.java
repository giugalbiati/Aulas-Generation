package Heranca;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome, int idade,String som, String atividade) {
		super(nome,idade,som,atividade);
	}
	
	String nome = "Caramelo";
	int idade = 100;
	String som = "Latido alto";
	String atividade = "Corre";
	
	
	public void informacaoAnimal() {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do animal: "+getIdade()+"\nAltura do som: "+getSom()+
				"\nVelocidade de corrida: "+getAtividade());
	}
	
	public void dadosAnimal() {
		System.out.println("\nNome do animal: "+nome+"\nIdade do animal: "+idade+"\nAltura do som: "+som+
				"\nVelocidade de corrida: "+atividade);
	}
	
	
}
