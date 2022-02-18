package tarefas;

public class testeCliente {

	public static void main(String[] args) 
	{
		System.out.println("\n\t\tEntrada de valores:");
		
		Cliente auto1 = new Cliente("Thainá","Açaí","Água de Coco",20);
		auto1.Imprimir();
		System.out.println("\nCompra efetuada --> +R$20,00 no caixa");

	}

}
