package exercicio09;

import java.util.Scanner;

public class ContadorDePalavras {
	public final static Scanner TECLADO = new Scanner(System.in);
	private String frase;
	
	public int getQuantidadeDePalavras() {
		String[] fraseFatiada = frase.split(" ");
		return fraseFatiada.length;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

}
