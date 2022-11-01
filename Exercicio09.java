package tarefa06;

import java.util.Scanner;

//9. Elaborar um programa que efetue a leitura de um número inteiro e 
//apresentar uma mensagem informando se o número é par ou ímpar

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número. ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("O numero digitado é par.");
		} else {
			System.out.println("O numero digitado é impar");
		}
		sc.close();
	}

}
