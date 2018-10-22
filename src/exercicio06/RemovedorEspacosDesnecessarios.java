package exercicio06;

public class RemovedorEspacosDesnecessarios {
	private String frase;
	private String[] nomeVetor;

	public String removeEspacos() {
		this.nomeVetor = this.frase.split(" ");
		StringBuilder nomeTratado = new StringBuilder();

		for (int i = 0; i < nomeVetor.length; i++) {
			if (!nomeVetor[i].equals("")) {
				nomeTratado.append(nomeVetor[i] += " ");
			}
		}
		return nomeTratado.toString().trim();
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
}
