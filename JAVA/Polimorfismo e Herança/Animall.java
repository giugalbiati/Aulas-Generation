package tarefas;

public abstract class Animall {

private String tipoA;
	
	public Animall (String tipoA)
	{
		this.tipoA = tipoA;
	}
	
	abstract public void nome(String nomeA);
	abstract public void idade(int idadeA);
	abstract public void som(String somA);

	public String getTipoA() {
		return tipoA;
	}

	public void setTipoA(String tipoA) {
		this.tipoA = tipoA;
	}
	
	

}
