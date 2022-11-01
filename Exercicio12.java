package tarefa06;

import java.util.Scanner;

//12. Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com sa�da uma das seguintes 
//mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem 
//"Ilma Sra.", para o sexo informado como feminino. Apresente tamb�m junto da mensagem de sauda��o o nome previamente informado.

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome.");
		String nome = sc.nextLine();

		System.out.println("Digite seu g�nero.(F-M)");
		char genero = sc.next().charAt(0);

		if (genero == 'F'|| genero == 'f') {
			System.out.println("Ilma Sra " + nome);
		} else if (genero == 'M'|| genero == 'm') {
			System.out.println("Ilmo Sr " + nome);
		} else {
			System.out.println("Genero invalido, forne�a (F) para Feminino ou (M) para Masculino");
		}
		sc.close();
	}

}
