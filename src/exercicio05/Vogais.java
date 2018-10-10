package exercicio05;

import java.util.ArrayList;

public class Vogais {

	private String vogais = "aeiou";

	public int qtdVogais(String nome) {
		String[] partes = nome.split("");
		int acumulador = 0;

		for (int i = 0; i < partes.length; i++) {
			if (this.vogais.contains(partes[i])) {
				acumulador++;
			}
		}

		return acumulador;
	}

}
