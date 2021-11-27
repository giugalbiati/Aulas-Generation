package tarefas;

public class Cavalo extends Animal {
	
	private String porte;
	
	public Cavalo(String nome,String som,String locomocao,String porte,int idade)
	{
		super(nome,som,locomocao,idade);
		this.porte = porte;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal:"+getNome()+"Idade: "+getIdade()+"\nSom emitido: "+getSom()+
				"\nAtividade habitual: "+getLocomocao()+"\nPorte: "+porte);
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	

}
