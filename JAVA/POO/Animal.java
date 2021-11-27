package tarefas;

public class Animal {

	private String nome;
	private String som;
	private String locomocao;
	private int idade;
	
	public Animal(String nome, String som, String locomocao, int idade)
	{
		this.nome = nome;
		this.som = som;
		this.locomocao = locomocao;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
