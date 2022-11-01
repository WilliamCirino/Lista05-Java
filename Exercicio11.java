package tarefa06;

import java.util.Scanner;

//11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
//apresentação, caso o valor não seja maior que três.

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número. ");
		int num = sc.nextInt();

		if (num < 4) {
			System.out.println("Este foi seu número digitado: " + num);
		} else {
			System.out.println("O valor digitado não foi maior do que 3, portanto não será apresentado.");
		}
		sc.close();
	}

}
