package tarefas;

public class Pregui�aa extends Animall {

	public Pregui�aa()
	{
		super("Animal Pregui�a");
	}
	
	@Override
	public void nome(String nomeA)
	{
		System.out.println("\nNome da pregui�a: "+nomeA);
	}
	
	@Override
	public void idade(int idadeA)
	{
		System.out.println("\nIdade da pregui�a: "+idadeA);
	}
	
	@Override
	public void som(String somA)
	{
		System.out.println("\nSom que a sua pregui�a emite: "+somA);
	}
	
	public void Atividade()
	{
		System.out.println("\nUma atividade habitual da pregui�a � subir em �rvores.");
	}
}
