package screanMacth.modelo;

public class Episodio {
	private int numero;
	private String nome;
	private Serie serie;

	public Episodio(int numero, String nome, Serie serie) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.serie = serie;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

}
