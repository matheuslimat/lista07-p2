package exercicio04;

public class Maiusculo {

	private String nome;
	
	public Maiusculo(String nome){
		this.nome = nome;
	}
	
	public String getMaiusculo() {
		return nome.toUpperCase().trim();
	}
}
