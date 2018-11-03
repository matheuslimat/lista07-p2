package exercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class OcorrenciasDeLetras {

	public static final Scanner TECLADO = new Scanner(System.in);
	private String frase;
	ArrayList<Integer> contDeIndice = new ArrayList<Integer>();

	public void setQtdDeOcorrencias(String letra) {
		String[] fraseFatiada = frase.split("");
		for (int i = 0; i < frase.length(); i++) {
			if (fraseFatiada[i].equals(letra)) {
				contDeIndice.add(i);
			}
		}
	}

	@Override
	public String toString() {
		return contDeIndice.toString();
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

}
