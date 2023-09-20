package screanMacth.modelo;

public class Serie extends Titulo {
	
	private String diretors;
	private int qtdTemporadas;
	private int episodiosTemporadas;
	private int minutosEpisodios;

	public Serie(String nome, int anoLancamento) {
		super(nome, anoLancamento);
		// TODO Auto-generated constructor stub
	}

	public String getDiretors() {
		return diretors;
	}

	public void setDiretors(String diretors) {
		this.diretors = diretors;
	}

	public int getQtdTemporadas() {
		return qtdTemporadas;
	}

	public void setQtdTemporadas(int qtdTemporadas) {
		this.qtdTemporadas = qtdTemporadas;
	}

	public int getEpisodiosTemporadas() {
		return episodiosTemporadas;
	}

	public void setEpisodiosTemporadas(int episodiosTemporadas) {
		this.episodiosTemporadas = episodiosTemporadas;
	}

	public int getMinutosEpisodios() {
		return minutosEpisodios;
	}

	public void setMinutosEpisodios(int minutosEpisodios) {
		this.minutosEpisodios = minutosEpisodios;
	}

	@Override
	public int getDuracaoMinutos() {
		return qtdTemporadas * episodiosTemporadas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Série: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
	}

}
