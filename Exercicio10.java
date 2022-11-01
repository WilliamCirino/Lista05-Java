package tarefa06;

import java.util.Scanner;

//10. Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Ap�s a leitura do 
//valor fornecido pelo usu�rio, o programa dever� indicar uma de duas mensagens: "O valor est� na faixa permitida", 
//caso o usu�rio forne�a o valor nesta faixa, ou a mensagem 
//"O valor est� fora da faixa permitida", caso o usu�rio forne�a valores menores que 1 ou maiores que 9.

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro entre 1 e 9. ");
		int num = sc.nextInt();

		if (num < 10 && num >= 1) {
			System.out.println("O valor est� na faixa permitida: " + num);
		} else {
			System.out.println("O valor est� fora da faixa permitida: " + num);
		}
		sc.close();
	}

}
