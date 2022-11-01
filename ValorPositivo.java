package tarefa06;

import java.util.Scanner;

public class ValorPositivo {

	/*
	 * Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
	 * n�mero lido como sendo um valor positivo, ou seja, o programa dever�
	 * apresentar o m�dulo de um n�mero fornecido. Lembre-se de verificar se o
	 * n�mero fornecido � menor que zero; sendo, multiplique-o por -1.
	 */
	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero. ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo n�mero. ");
		float numero2 = sc.nextFloat();
		System.out.println("Digite o terceiro n�mero. ");
		float numero3 = sc.nextFloat();

		float delta = (numero2 * numero2) - 4 * numero1 * numero3;

		if (delta > 0) {
			float x1 = (float) ((-numero2 + Math.sqrt(delta)) / (2 * numero1));
			float x2 = (float) ((-numero2 - Math.sqrt(delta)) / (2 * numero1));
			System.out.println("O valor de X e = " + x1 + " Valor de X e = " + x2);
		} else {
			System.out.println("\"N�o e possivel calcular esta Raiz, n�o e um numero real \"");
		}

		sc.close();
	}
}