package ExerciciosJava;

import java.util.HashMap;

public class CamposRegistros {

	public static void main(String[] args) {

		HashMap<String, String> nomeEmail = new HashMap<String, String>();
		nomeEmail.put("Ricardo", "ricardo@email.com");
		nomeEmail.put("Will", "will@email.com");
		System.out.println(nomeEmail);
		System.out.println(nomeEmail.get("Ricardo"));
	}

}
