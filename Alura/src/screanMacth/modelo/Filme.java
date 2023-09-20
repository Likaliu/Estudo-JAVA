package screanMacth.modelo;

import screanMacth.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
	private String diretor;

	
	public Filme(String nome, int anoLancamento) {
		super(nome, anoLancamento);
		// TODO Auto-generated constructor stub
	}
	
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
