package tarefas;

public class Preguiçaa extends Animall {

	public Preguiçaa()
	{
		super("Animal Preguiça");
	}
	
	@Override
	public void nome(String nomeA)
	{
		System.out.println("\nNome da preguiça: "+nomeA);
	}
	
	@Override
	public void idade(int idadeA)
	{
		System.out.println("\nIdade da preguiça: "+idadeA);
	}
	
	@Override
	public void som(String somA)
	{
		System.out.println("\nSom que a sua preguiça emite: "+somA);
	}
	
	public void Atividade()
	{
		System.out.println("\nUma atividade habitual da preguiça é subir em árvores.");
	}
}
