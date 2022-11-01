package tarefa06;

import java.util.Scanner;

public class ValorPositivo {

	/*
	 * Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
	 * número lido como sendo um valor positivo, ou seja, o programa deverá
	 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
	 * número fornecido é menor que zero; sendo, multiplique-o por -1.
	 */
	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número. ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo número. ");
		float numero2 = sc.nextFloat();
		System.out.println("Digite o terceiro número. ");
		float numero3 = sc.nextFloat();

		float delta = (numero2 * numero2) - 4 * numero1 * numero3;

		if (delta > 0) {
			float x1 = (float) ((-numero2 + Math.sqrt(delta)) / (2 * numero1));
			float x2 = (float) ((-numero2 - Math.sqrt(delta)) / (2 * numero1));
			System.out.println("O valor de X e = " + x1 + " Valor de X e = " + x2);
		} else {
			System.out.println("\"Não e possivel calcular esta Raiz, não e um numero real \"");
		}

		sc.close();
	}
}