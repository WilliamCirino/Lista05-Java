package tarefa06;

import java.util.Scanner;

//9. Elaborar um programa que efetue a leitura de um n�mero inteiro e 
//apresentar uma mensagem informando se o n�mero � par ou �mpar

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero. ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("O numero digitado � par.");
		} else {
			System.out.println("O numero digitado � impar");
		}
		sc.close();
	}

}
