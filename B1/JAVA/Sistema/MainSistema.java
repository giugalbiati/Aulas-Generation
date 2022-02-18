package Sistema;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		int op;

		System.out.println("Digite sua matricula: ");
		Validador.setUsuario(leia.nextInt());
		Validador.validadorMatricula();

		
		while (Validador.getUsuarioOK() != true) {
			System.out.println("Matricula não encontrada digite sua matricula novamente: ");
			Validador.setUsuario(leia.nextInt());
			Validador.validadorMatricula();
		}

		System.out.println("\n\t\t\tOlá, "+Validador.getMatricula().get(Validador.getUsuario()));
		do {
			System.out.println("\n(1) Iniciar jornada de trabalho");
			System.out.println("\n(2) Encerrar jornada de trabalho");
			System.out.println("\n***********************************************************************");
			System.out.println("\n(3) Iniciar pausa");
			System.out.println("\n(4) Encerrar pausa");
			System.out.println("\n(5) Sair do sistema");
			System.out.println("\nDigite a sua opção: ");

			op = leia.nextInt();

			switch (op) {
			case 1:

				System.out.println("--------------------------------------------------------------------\n");
				ControlePonto.IniciarJ();
				System.out.println("--------------------------------------------------------------------\n");

				break;
			case 2:

				System.out.println("--------------------------------------------------------------------");
				ControlePonto.EncerrarJ();
				System.out.println("--------------------------------------------------------------------");

				break;

			case 3:

				System.out.println("--------------------------------------------------------------------");
				ControlePonto.IniciarPausa();
				System.out.println("--------------------------------------------------------------------");
				break;

			case 4:

				System.out.println("--------------------------------------------------------------------");
				ControlePonto.EncerrarPausa();
				System.out.println("--------------------------------------------------------------------");
				break;	
				
			case 5:
				System.out.println("Tenha um excelente descanso");
				break;
			default:
				System.out.println("Dados inválidos. . .");
			}

		} while (op !=5);
		
	}

}
