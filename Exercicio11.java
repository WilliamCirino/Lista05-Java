package tarefa06;

import java.util.Scanner;

//11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
//apresenta��o, caso o valor n�o seja maior que tr�s.

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero. ");
		int num = sc.nextInt();

		if (num < 4) {
			System.out.println("Este foi seu n�mero digitado: " + num);
		} else {
			System.out.println("O valor digitado n�o foi maior do que 3, portanto n�o ser� apresentado.");
		}
		sc.close();
	}

}
