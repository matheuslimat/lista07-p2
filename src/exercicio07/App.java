package exercicio07;

import java.util.Scanner;

public class App {

	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		OcorrenciasDeLetras ocorrenciasDeLetras = new OcorrenciasDeLetras();

		System.out.println("Digite uma frase: ");
		String frase = TECLADO.nextLine();
		ocorrenciasDeLetras.setFrase(frase);

		String letra;
		System.out.println("Digite a letra a ser procurada: ");
		letra = TECLADO.nextLine();
		ocorrenciasDeLetras.setQtdDeOcorrencias(letra);

		System.out.println(ocorrenciasDeLetras.toString());

	}

}
