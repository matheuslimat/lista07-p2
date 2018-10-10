package exercicio01;

import java.util.Scanner;

public class PadronizadorDeNome {

	private static final Scanner TECLADO = new Scanner(System.in);
	private static final StringBuilder NOME_FINAL = new StringBuilder();

	public String getNome(String escolha, String nomeAtributo) {
		String[] partes = nomeAtributo.split(" ");

		if (escolha.equals("metodo") || escolha.equals("atributo")) {
			// Pega primeiro indice da palavra antes e deixa minusculo.
			NOME_FINAL.append(partes[0].substring(0, 1).toLowerCase().concat(partes[0].substring(1)));
		} else {
			// Pega primeiro indice da palavra antes e deixa maiusculo.
			NOME_FINAL.append(partes[0].substring(0, 1).toUpperCase().concat(partes[0].substring(1)));
		}

		// Se o partes fosse uma string o length teria o ().
		for (int i = 1; i < partes.length; i++) {
			NOME_FINAL.append(partes[i].substring(0, 1).toUpperCase().concat(partes[i].substring(1)));
		}
		return NOME_FINAL.toString();
	}

}
