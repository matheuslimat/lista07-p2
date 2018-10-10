package exercicio03;

public class Palindromo {

	private String nome;

	public Palindromo(String nome) {
		this.nome = nome;
	}

	public String inverteNome() {
		StringBuilder nomeInvertido = new StringBuilder();

		// memorizar bem como faz o for invertido.
		for (int i = this.nome.length() - 1; i >= 0; i--) {
			nomeInvertido.append(this.nome.charAt(i));
		}

		return nomeInvertido.toString();
	}
}
