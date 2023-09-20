package poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(123, 456);
		conta.depositar(100);
		System.out.println(Conta.getTotal());

	}

}
