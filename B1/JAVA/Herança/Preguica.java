package Heranca;

public class Preguica extends Animal {
	
	
	public Preguica(String nome, int idade,String som, String atividade) {
		super(nome,idade,som,atividade);
	}
	
	String nome = "Joaquim";
	int idade = 8;
	String som = "baixo";
	String atividade = "Escala arvores";
	
	
	
	public void informacaoAnimal() {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do animal: "+getIdade()+"\nAltura do som: "+getSom()+
				"\nVelocidade de corrida: "+getAtividade());
	}
	
	public void dadosAnimal() {
		System.out.println("\nNome do animal: "+nome+"\nIdade do animal: "+idade+"\nAltura do som: "+som+
				"\nVelocidade de corrida: "+atividade);
	}
}

