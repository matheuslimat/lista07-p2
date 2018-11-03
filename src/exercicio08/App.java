package exercicio08;

import java.util.Scanner;

public class App {
	
	private static final Scanner TECLADO = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero binario: ");
		NumeroBinario numerobinario = new NumeroBinario(TECLADO.nextLine());
		
		System.out.println(numerobinario.getDecimal());
		
	}

}
