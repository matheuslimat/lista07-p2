package exercicio05;

import java.util.Scanner;

public class App {
	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		Vogais nome = new Vogais();

		System.out.println("Digite a frase: ");
		System.out.println("A quantidade de vogais é: " + nome.qtdVogais(TECLADO.nextLine().toLowerCase()));

	}
}
