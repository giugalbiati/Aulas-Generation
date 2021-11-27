package tarefas;

public class Cliente {
	
	private String nomeCliente;
	private String sobremesa;
	private String bebida;
	private int valor;
	
	public Cliente(String nomeCliente,String sobremesa,String bebida,int valor)
	{
		this.nomeCliente = nomeCliente;
		this.sobremesa = sobremesa;
		this.bebida = bebida;
		this.valor = valor;
	}
	public Cliente(int valor)
	{
		this.valor = valor;
	}
	public void Imprimir()
	{
		System.out.println("\n"+nomeCliente+" comprou um "+sobremesa+" e uma "+bebida+" e pagou: "+valor+" reais.");
	}
	public String getnomeCliente()
	{
		return nomeCliente;
	}
	public void setnomeCliente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}
	public String getSobremesa()
	{
		return sobremesa;
	}
	public void setSobremesa(String sobremesa)
	{
		this.sobremesa = sobremesa;
	}
	public String getBebida()
	{
		return bebida;
	}
	public void setBebida(String bebida)
	{
		this.bebida = bebida;
	}
	public int getValor()
	{
		return valor;
	}
	public void setValor(int valor)
	{
		this.valor = valor;
	}

}
