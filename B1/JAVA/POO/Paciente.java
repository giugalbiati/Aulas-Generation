package tarefas;

public class Paciente {

	private String nomePaciente;
	private String sintomas;
	private String genero;
	private int idade;
	
	public Paciente(String nomePaciente, int idade, String genero, String sintomas)
	{
		this.nomePaciente = nomePaciente;
		this.idade = idade;
		this.genero = genero;
		this.sintomas = sintomas;
	}
	
	public Paciente(int idade)
	{
		this.idade = idade;
	}
	
	public void Imprimir() {
	}
	{
		System.out.println("\n"+nomePaciente+" de "+idade+" anos, do gênero "+genero+" possui os sintomas: "+sintomas);
	}
	
	public String getNomePaciente() 
	{
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) 
	{
		this.nomePaciente = nomePaciente;
	}
	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public String getGenero() 
	{
		return genero;
	}

	public void setGenero(String genero) 
	{
		this.genero = genero;
	}

	public String getSintomas() 
	{
		return sintomas;
	}

	public void setSintomas(String sintomas) 
	{
		this.sintomas = sintomas;
	}

	
}
