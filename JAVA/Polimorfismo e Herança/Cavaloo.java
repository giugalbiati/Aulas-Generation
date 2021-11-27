package tarefas;

public class Cavaloo extends Animall{

	public Cavaloo()
	{
		super("Animal Cavalo");
	}
	
	@Override
	public void nome(String nomeA)
	{
		System.out.println("\nNome do cavalo: "+nomeA);
	}
	
	@Override
	public void idade(int idadeA)
	{
		System.out.println("\nIdade do cavalo: "+idadeA);
	}
	
	@Override
	public void som(String somA)
	{
		System.out.println("\nSom que o seu cavalo emite: "+somA);
	}
	
	public void Atividade()
	{
		System.out.println("\nUma atividade habitual do cavalo é correr.");
	}
}
