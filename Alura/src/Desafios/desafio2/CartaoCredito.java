package Desafios.desafio2;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
	private double limite;
	private int numeroCartao;
	private double saldo;
	private List<Compra> compras;

	public CartaoCredito(double limite, int numeroCartao) {
		super();
		this.limite = limite;
		this.numeroCartao = numeroCartao;
		this.saldo = limite;
		this.compras = new ArrayList<>();
	}

	public double getLimite() {
		return limite;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean controlaGastos(Compra compra) {
		if (this.saldo >= compra.getValorCompra()) {
			this.saldo -= compra.getValorCompra();
			this.compras.add(compra);
			return true;
		}
		return false;
	}
}

/* 
 * O QUE VAMOS FAZER? Criar uma aplicação para lançamento de compras com cartão
 * de crédito Menu para lançamento de compras Exibição da lista de compras
 * realizadas e ordenadas por valor O menu é para realizar as compras, ou seja,
 * essas compras deverão ser armazenadas em uma lista e depois essa lista deve
 * ser exibida e ordenada por valor.
 */