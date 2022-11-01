package tarefa06;

import java.util.Scanner;

//7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número.");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo número.");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro número.");
		int numero3 = sc.nextInt();

		System.out.println("Digite o quarto número.");
		int numero4 = sc.nextInt();

		if (numero1 % 2 == 0 && numero1 % 3 == 0) {
			System.out.println("O numero "+numero1+" São divisíveis por 2 e 3 ");
		}
		if (numero2 % 2 == 0 && numero2 % 3 == 0) {
			System.out.println("O numero "+numero2+" São divisíveis por 2 e 3 ");
		}
		if (numero3 % 2 == 0 && numero3 % 3 == 0) {
			System.out.println("O numero "+numero3+" São divisíveis por 2 e 3 ");
		}
		if (numero4 % 2 == 0 && numero4 % 3 == 0) {
			System.out.println("O numero "+numero4+" São divisíveis por 2 e 3 ");
		}
		sc.close();
	}

}
