package tarefas;

public class Cachorro extends Animal{
	
	private String raca;
	private String porte;
	
	public Cachorro(String nome,String som,String locomocao,String raca,String porte,int idade)
	{
		super(nome,som,locomocao,idade);
		this.raca = raca;
		this.porte = porte;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+"\nIdade:"+getIdade()+"\nSom emitido: "+getSom()+
				"\nAtividade habitual: "+getLocomocao()+"\nRaça: "+raca+"\nPorte: ");
		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}

}
