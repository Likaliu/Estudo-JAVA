package Desafios.desafio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner entrada = new Scanner(System.in)) {

			CartaoCredito cartao1 = new CartaoCredito(1000, 123456);

			int opcao = 0;

			do {
				System.out.println("Escolha um opcao: ");
				System.out.println("[1] - comprar\n[2] - Consultar saldo\n[3] - Sair");
				int num = entrada.nextInt();

				if (num == 1) {

					System.out.println("Informe a descricao do produto ");
					String descricao = entrada.next();

					System.out.println("Informe o valor do produto ");
					double valor = entrada.nextDouble();

					Compra compra = new Compra(descricao, valor);
					boolean compraRealizada = cartao1.controlaGastos(compra);

					if (compraRealizada) {
						System.out.println("Compra realizada com sucesso");
					} else {
						System.out.println("Saldo insuficiente! " + "Saldo: " + cartao1.getSaldo());
						break;
					}

				} else if (num == 2) {
					System.out.println("Seu saldo atual é: " + cartao1.getSaldo());
				} else if (num == 3) {
					System.out.println("Saindo...");
					break;
				} else {
					System.out.println("Opção inválida");
				}

			} while (opcao != 3);
			// implemntar para listar as compras feitas e o valor de cada compra

		}

	}
}
