package tarefa06;

import java.util.Scanner;

//7. Efetuar a leitura de quatro n�meros inteiros e apresentar os n�meros que s�o divis�veis por 2 e 3.

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero.");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo n�mero.");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro n�mero.");
		int numero3 = sc.nextInt();

		System.out.println("Digite o quarto n�mero.");
		int numero4 = sc.nextInt();

		if (numero1 % 2 == 0 && numero1 % 3 == 0) {
			System.out.println("O numero "+numero1+" S�o divis�veis por 2 e 3 ");
		}
		if (numero2 % 2 == 0 && numero2 % 3 == 0) {
			System.out.println("O numero "+numero2+" S�o divis�veis por 2 e 3 ");
		}
		if (numero3 % 2 == 0 && numero3 % 3 == 0) {
			System.out.println("O numero "+numero3+" S�o divis�veis por 2 e 3 ");
		}
		if (numero4 % 2 == 0 && numero4 % 3 == 0) {
			System.out.println("O numero "+numero4+" S�o divis�veis por 2 e 3 ");
		}
		sc.close();
	}

}
