package lista5;

import java.util.Scanner;

public class ValorPositivo {

	/*
	 * Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
	 * número lido como sendo um valor positivo, ou seja, o programa deverá
	 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
	 * número fornecido é menor que zero; sendo, multiplique-o por -1.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor. (Positivo ou Negativo)");
		int valor = sc.nextInt();

		if (valor > 0) {
			System.out.println("O módulo de um número fornecido é: " + valor);
		} else {
			int valor2 = valor * (-1);
			System.out.println("O módulo de um número fornecido é: " + valor2);
		}
		sc.close();
	}

}
