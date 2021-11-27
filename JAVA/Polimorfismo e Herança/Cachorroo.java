package tarefas;

public class Cachorroo extends Animall{

	public Cachorroo()
	{
		super("Animal Cachorro");
	}
	
	@Override
	public void nome(String nomeA)
	{
		System.out.println("\nNome do cachorro: "+nomeA);
	}
	
	@Override
	public void idade(int idadeA)
	{
		System.out.println("\nIdade do cachorro: "+idadeA);
	}
	
	@Override
	public void som(String somA)
	{
		System.out.println("\nSom que o seu cachorro emite: "+somA);
	}
	
	public void Atividade()
	{
		System.out.println("\nUma atividade habitual do cachorro é correr.");
	}

}
