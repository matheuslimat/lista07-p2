package exercicio06;

import java.util.Scanner;

public class App {

	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		RemovedorEspacosDesnecessarios objetofrase = new RemovedorEspacosDesnecessarios();

		System.out.println("Digite uma frase: ");
		String frase = TECLADO.nextLine();

		objetofrase.setFrase(frase);
		System.out.println(objetofrase.removeEspacos());

	}

}
