package exercicio04;

import java.util.Scanner;

public class App {
	
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite uma frase ou nome: ");
		String nome = TECLADO.nextLine();
		
		Maiusculo maiusculo = new Maiusculo(nome);
		System.out.println(maiusculo.getMaiusculo());
	}

}
