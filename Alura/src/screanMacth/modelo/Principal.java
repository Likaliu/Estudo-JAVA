package screanMacth.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import screanMacth.calculo.CalculadoraTempo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();

		Filme filme1 = new Filme("Mulher Maravilha", 2015);
		Filme filme2 = new Filme("Homem Aranha", 2011);
		Filme filme3 = new Filme("Pantera Negra", 2022);
		Filme filme4 = new Filme("Ariel", 2023);
		Filme filme5 = new Filme("Barbie", 2023);
		Filme filme6 = new Filme("O Milagre na Cela 7", 2009);
		Filme filme7 = new Filme("Corra", 2015);
		Filme filme8 = new Filme("Lupin", 2000);
		Filme filme9 = new Filme("Mulheres Incrivéis", 2006);
		Filme filme10 = new Filme("Mágico de Oz", 2001);
		
		listaDeFilmes.add(filme1);
		listaDeFilmes.add(filme2);
		listaDeFilmes.add(filme3);
		listaDeFilmes.add(filme4);
		listaDeFilmes.add(filme5);
		listaDeFilmes.add(filme6);
		listaDeFilmes.add(filme7);
		listaDeFilmes.add(filme8);
		listaDeFilmes.add(filme9);
		listaDeFilmes.add(filme10);

		filme1.setDiretor("Beyoncé");
		filme1.avalia(10);
		filme1.setDiretor("Norbet Russo");
		filme1.setDuracaoMinutos(280);
		filme1.relatorio();
		
		CalculadoraTempo calc = new CalculadoraTempo();
		calc.inclui(filme1);
		System.out.println(calc.getTempoTotal());
		
		ArrayList<Serie> listaDeSeries = new ArrayList<Serie>();
		
		Serie serie1 = new Serie("Jogo Secreto", 2015);
		Serie serie2 = new Serie("Irmandade", 2023);
		Serie serie3 = new Serie("Pretos em Perigo", 2005);
		Serie serie4 = new Serie("Beyoncé Show now", 2003);
		Serie serie5 = new Serie("Árvore Binária", 2023);
		Serie serie6 = new Serie("Jardim do Éden", 2019);
	
		listaDeSeries.add(serie1);
		listaDeSeries.add(serie2);
		listaDeSeries.add(serie3);
		listaDeSeries.add(serie4);
		listaDeSeries.add(serie5);
		listaDeSeries.add(serie6);
		
		//PODERIA TER FEITO DESSA FORMA QUE É MAIS SIMPLES E MAIS LIMPA, QUE SERVIRÁ
		//TANTO PARA FILME COMO PARA SÉRIE.
		ArrayList<Titulo> lista = new ArrayList<Titulo>();
		lista.add(filme10);
		//iterando sobre a lista de filmes e séries tbm
		for(Titulo item : lista) {
			if(item instanceof Filme filme ) { //java 14
				System.out.println("Classifcação: " + filme.getClassificacao());
			}
		}
		
		lista.add(serie5);
		for(Titulo item : lista) { 
			if(item instanceof Serie serie) {
				System.out.println("Classificação" + serie.getClassificacao());
			}
		}
		
		//Ordeanando a lista
		//List<String> buscaPorArtista = new ArrayList<>(); PODERIA SER FEITO 
		//USANDO List. LEMBRANDO QUE NÃO PODER CLOLOCAR: List<String> buscaPorArtista = new List<>() 
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Liane Luz");
		buscaPorArtista.add("Beyoncé");
		buscaPorArtista.add("Ana Carv");
		System.out.println(buscaPorArtista);
		
		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação : " + buscaPorArtista);
		
		//ordenando a lista de filmes
		Collections.sort(lista);
		System.out.println(lista);
		
		//ordenandp por ano
		lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
		System.out.println(lista);
		
		
		
	

	}

}
