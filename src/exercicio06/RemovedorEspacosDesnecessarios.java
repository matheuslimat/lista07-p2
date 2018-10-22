package exercicio06;

public class RemovedorEspacosDesnecessarios {
	private String frase;
	private String[] nomeVetor;

	public String removeEspacos() {
		this.nomeVetor = this.frase.split(" ");
		StringBuilder nomeTratado = new StringBuilder();

		for (int i = 0; i < nomeVetor.length; i++) {
			// Verifica se é igual a string vazio e testa a logica inversa "!"
			if (!nomeVetor[i].equals("")) {
				// Adiciona espaço ao final da palavra de cada posição da lista
				nomeTratado.append(nomeVetor[i] += " ");
			}
		}
		// Tira o ultimo espaço q foi adicionado no ultimo "for"
		return nomeTratado.toString().trim();
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
}
