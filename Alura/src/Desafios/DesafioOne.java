package Desafios;

import java.security.SecureRandom;
import java.util.Scanner;

public class DesafioOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BEM IVNDO AO JOGO DA ADIVINHAÇÃO");
		Scanner entrada = new Scanner(System.in);

		SecureRandom aleatorio = new SecureRandom();
		int num = 1 + aleatorio.nextInt(100);
		// System.out.println(num);
		
		int tentativas = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.println("digite um número");
			int numDigitado = entrada.nextInt();
			
			if (numDigitado == num) {
				System.out.println("Acertou! O número era: " + num);
				break;
			} else {
				System.out.println("Errado");
		
			}
			tentativas ++;
			System.out.println("Numero de tentativas: " + tentativas);
	
		}
		entrada.close();

	}
}
