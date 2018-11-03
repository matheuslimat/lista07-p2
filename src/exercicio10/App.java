package exercicio10;

import java.util.Scanner;

public class App {
	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HistogramaDeLetras histogramaDeLetras = new HistogramaDeLetras();
		
		System.out.println("Digite uma frase: ");
		histogramaDeLetras.setFrase(TECLADO.nextLine());
		
		System.out.println(histogramaDeLetras.getHistograma());
		
	}
}
