package Heranca;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String atividade;
	
	
	public Animal(String nome,int idade, String som,String atividade) {
		this.nome	= nome;
		this.idade = idade;
		this.som = som;
		this.atividade = atividade;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public String getAtividade() {
		return atividade;
	}


	public void setCorrer(String atividade) {
		this.atividade = atividade;
	}
	
	
	
	
	
	
}
