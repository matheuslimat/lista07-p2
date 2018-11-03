package exercicio10;

import java.util.ArrayList;

public class HistogramaDeLetras {

	private String frase;
	private String histograma = "a 0 b 0 c 0 d 0 e 0 f 0 g 0 h 0 i 0 j 0 k 0 l 0 m 0 n 0 o 0 p 0 q 0 r 0 s 0 t 0 u 0 v 0 x 0 z 0";
	private String[] histogramaFatiado = histograma.split("");
	
	// corrigir
	public String[] getHistograma(){
		String[] fraseFatiada = frase.split("");
		for (String string : fraseFatiada) {
			int cont = 0;
			for (int i = 0; i < histogramaFatiado.length; i++) {
				if (histogramaFatiado[i].equals(string)) {
					cont ++;
				}
			}
			histogramaFatiado[histograma.indexOf(string)+2] += Integer.toString(cont);
		}
		return histogramaFatiado;
		
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
}
