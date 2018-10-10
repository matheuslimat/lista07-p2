package exercicio02;

public class ComparaString {

	private String nome1;
	private String nome2;

	public ComparaString(String nome1, String nome2) {
		this.nome1 = nome1;
		this.nome2 = nome2;
	}

	public String getAnterior() {
		if (this.nome1.charAt(0) > this.nome2.charAt(0)) {
			return this.nome2;
		} else if (this.nome1.charAt(0) < this.nome2.charAt(0)) {
			return this.nome1;
		} else {
			return this.nome1;
		}
	}

	public String getPosterior() {
		if (this.nome1.charAt(0) > this.nome2.charAt(0)) {
			return this.nome1;
		} else if (this.nome1.charAt(0) < this.nome2.charAt(0)) {
			return this.nome2;
		} else {
			return this.nome2;
		}
	}
}
