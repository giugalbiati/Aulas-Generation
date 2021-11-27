package tarefas;

public class Preguiça extends Animal{

	private String cor;
	
	public Preguiça(String nome,String som,String locomocao,String cor,int idade)
	{
		super(nome,som,locomocao,idade);
		this.cor = cor;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade: "+getIdade()+"\nSom emitido: "+getSom()+
				"\nAtividade habitual: "+getLocomocao()+"\nCor: "+cor);
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
