package exercicio02;

import java.util.Scanner;

public class App {

	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		String nome1, nome2;

		System.out.println("Digite a primeira String: ");
		nome1 = TECLADO.nextLine();

		System.out.println("Digite a segunda String: ");
		nome2 = TECLADO.nextLine();

		ComparaString nome = new ComparaString(nome1, nome2);

		System.out.println("String anterior: " + nome.getAnterior());

		System.out.println("String posterior: " + nome.getPosterior());
	}

}
