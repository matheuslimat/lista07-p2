package exercicio09;

import java.util.Scanner;

public class App {

	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ContadorDePalavras contadordepalavras = new ContadorDePalavras();
		
		System.out.println("Digite a frase: ");
		contadordepalavras.setFrase(TECLADO.nextLine());
		
		System.out.println(contadordepalavras.getQuantidadeDePalavras());
		
		
	}

}
