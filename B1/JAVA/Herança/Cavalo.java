package Heranca;

public class Cavalo extends Animal{

	
	public Cavalo(String nome, int idade,String som, String atividade) {
		super(nome,idade,som,atividade);
	}
	
	
	String nome = "Carpeado";
	int idade = 3;
	String som = "Relincho baixo";
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
