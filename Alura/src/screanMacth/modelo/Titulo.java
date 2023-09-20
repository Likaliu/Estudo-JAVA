package screanMacth.modelo;

public class Titulo implements Comparable<Titulo> {
	
	private String nome;
	private int anoLancamento;
	private double avaliacao;
	private boolean incluidoNoPlano;
	private int totalAvaliacao;
	private int duracaoMinutos;
	private double somaAvalicoes;

	public Titulo(String nome, int anoLancamento) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public double getAvalicao() {
		return avaliacao;
	}

	public void setAvalicao(double avalicao) {
		this.avaliacao = avalicao;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getTotalAvaliacao() {
		return this.totalAvaliacao;
	}

	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	public void relatorio() {

		System.out.println("RELATÓRIO DOS FILMES E SÉRIES");
		System.out.println("Nome: " + nome);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("Duração em minutos: " + duracaoMinutos);
		System.out.println("Incluido no plano" + incluidoNoPlano);
		System.out.println("Total de avaliações: " + totalAvaliacao);
	}

	public void avalia(double nota) {
		somaAvalicoes += nota;
		totalAvaliacao++;
	}

	public double media() {
		return somaAvalicoes / totalAvaliacao;
	}

	public int getClassificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	//para poder ordenar em ordem alfabáetica
	@Override
	public int compareTo(Titulo outroTitulo) {
		//compareToIgnoreCase para considerar tanto letras minúsculas e maisúcula.
		return this.getNome().compareToIgnoreCase(outroTitulo.getNome());
	}

}
