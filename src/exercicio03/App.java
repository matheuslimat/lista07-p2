package exercicio03;

import java.util.Scanner;

public class App {

	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite um nome: ");
		String nome = TECLADO.nextLine();
		
		Palindromo palindromo = new Palindromo(nome);
		System.out.println(palindromo.inverteNome());
		
	}

}
