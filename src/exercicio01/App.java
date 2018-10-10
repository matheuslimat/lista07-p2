package exercicio01;

import java.util.Scanner;

public class App {

	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {

		PadronizadorDeNome padronizadordenome = new PadronizadorDeNome();

		System.out.println("Digite: Atributo, Metodo ou Classe.");
		String escolha = TECLADO.nextLine().toLowerCase();

		if (escolha.equals("metodo") || escolha.equals("atributo")) {

			System.out.println("Digite o nome do atributo ou metodo: ");
			System.out.println(padronizadordenome.getNome(escolha, TECLADO.nextLine()));

		} else if (escolha.equals("classe")) {
			System.out.println("Digite o nome da classe: ");
			System.out.println(padronizadordenome.getNome(escolha, TECLADO.nextLine()));
		}
	}
}
