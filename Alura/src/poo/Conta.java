package poo;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	Conta() {
		System.out.println("Criando uma conta...");
	}

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Total de contas: " + Conta.total);
		this.saldo = 100;
		this.agencia = agencia;
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não permitido");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor não permitido");
			return;
		}
		this.numero = numero;
	}

	public static int getTotal() {
		return Conta.total;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Conta destino) {
		if (saldo >= valor) {
			saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

}
