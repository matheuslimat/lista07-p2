package exercicio08;

public class NumeroBinario {

	private String binario;
	
	public NumeroBinario(String binario) {
		this.binario = binario;
	}
	
	public int getDecimal() {
		int somaPosicao = 0;
		int posicao = 2;
		for(int i = binario.length() - 2; i > 0; i--) {
			char numero = binario.charAt(i);
			if (numero != '0') {
				somaPosicao += (int) Math.pow(posicao, Character.getNumericValue(numero));
			}
			posicao *= 2;
		}
		
		return somaPosicao + 1;
		
	}

}
