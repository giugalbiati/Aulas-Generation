package Sistema;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ControlePonto {
	
	
	private static String horaI;
	private static boolean jornada=false;
	private static boolean pausa=false;
	private static long inicioJornada;
	private static long fimJornada;
	private static long inicioPausa;
	private static long fimPausa;
	private static long total;
	private static int segundos;
	private static int minutos;
	private static int horas;
	private static String entrada;
	private static String saida;
	private static String entradaPausa;
	private static String saidaPausa;
	
	

	
	public static void IniciarJ() {
		if(jornada == false) {
			entrada = new SimpleDateFormat("HH:mm:ss").format(new Date());
			inicioJornada = System.currentTimeMillis();//inicia contador jornada de trabalho
			System.out.println("Jornada iniciada com sucesso as: "+entrada);
			System.out.println("\t\tBom trabalho!!");
			jornada = true;
		}
		else {
			System.out.println("A jornada já foi iniciada as: "+entrada);
		}
	}
	
	public static void EncerrarJ() {
		if(jornada == true) {
			saida = new SimpleDateFormat("HH:mm:ss").format(new Date());
			fimJornada = System.currentTimeMillis();//fim jornada de trabalho
			System.out.println("Jornada finalizada com sucesso as: "+saida);
			total = fimJornada - inicioJornada;
		    segundos = (int) ((total/1000) % 60);
		    minutos = (int) (((total/1000) / 60) % 60);
		    horas = (int) (((total/1000) / 60) / 60);
		    System.out.println("Você trabalhou por: "+horas+":"+minutos+":"+segundos);
			jornada = false;
		}
		else {
			System.out.println("Não pode encerrar jornada. \nVocê não esta trabalhando no momento.");
		}
	}	
	
	public static void IniciarPausa() {
		if(pausa == false && jornada == true) {
			entradaPausa = new SimpleDateFormat("HH:mm:ss").format(new Date());
			inicioPausa = System.currentTimeMillis();//inicia contador jornada de trabalho
			System.out.println("Sua pausa foi iniciada com sucesso as: "+entradaPausa);
			System.out.println("\t\tBoa pausa!!");
			pausa = true;
		}
		else {
			System.out.println("Não é possível tirar pausa no momento");
		}
	}
	
	public static void EncerrarPausa() {
		if(pausa == true) {
			saidaPausa = new SimpleDateFormat("HH:mm:ss").format(new Date());
			fimPausa = System.currentTimeMillis();//fim jornada de trabalho
			System.out.println("Pausa finalizada com sucesso as: "+saidaPausa);
			total = fimPausa - inicioPausa;
		    segundos = (int) ((total/1000) % 60);
		    minutos = (int) (((total/1000) / 60) % 60);
		    horas = (int) (((total/1000) / 60) / 60);
		    System.out.println("Sua pausa foi de: "+horas+":"+minutos+":"+segundos);
			pausa = false;
		}
		else {
			System.out.println("Não pode encerrar sua pausa. \nVocê não esta de pausa no momento.");
		}
	}	
	
	
	
}
