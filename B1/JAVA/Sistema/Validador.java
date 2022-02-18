package Sistema;

import java.util.ArrayList;

public class Validador {
	
	private static boolean usuarioOK=false;
	private static boolean senhaOK=false;
	private static int usuario;
	private static String senha;
	private static int id=3;

	
	private static ArrayList<String> matricula = new ArrayList <>(){{
		add("ADM");
		add("João");
		add("Lucas");
		add("Marcos");
		add("Luis");
	}};
	
	
	
	public static ArrayList<String> getMatricula() {
		return matricula;
	}


	public static void setMatricula(ArrayList<String> matricula) {
		Validador.matricula = matricula;
	}


	public static String getSenha() {
		return senha;
	}


	public static void setSenha(String senha) {
		Validador.senha = senha;
	}


	public static boolean getSenhaOK() {
		return senhaOK;
	}


	public static void setSenhaOK(boolean senhaOK) {
		Validador.senhaOK = senhaOK;
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Validador.id = id;
	}


	public static String getsenha() {
		return senha;
	}


	public static void setsenha(String senha) {
		Validador.senha = senha;
	}


	public static int getUsuario() {
		return usuario;
	}


	public static void setUsuario(int usuario) {
		Validador.usuario = usuario;
	}


	public static boolean getUsuarioOK() {
		return usuarioOK;
	}


	public static void setUsuarioOK(boolean usuarioOK) {
		Validador.usuarioOK = usuarioOK;
	}

	
	public static boolean validadorMatricula() {
		if(usuario >= 0 && usuario < matricula.size()) {
			setUsuarioOK(true);
			//setId(matricula.indexOf(usuario));
		}	
	return usuarioOK;
		}
	
}
