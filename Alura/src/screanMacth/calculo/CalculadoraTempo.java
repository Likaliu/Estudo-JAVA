package screanMacth.calculo;

import screanMacth.modelo.Titulo;

public class CalculadoraTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoMinutos();
		
	}
		
	
	
}
