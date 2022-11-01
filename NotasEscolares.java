package tarefa06;

import java.util.Scanner;

public class NotasEscolares {

	/*
	 * 3. Ler quatro valores referentes a quatro notas escolares de um aluno e
	 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
	 * escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma
	 * mensagem informando esta condição. Apresentar junto das mensagens o valor da
	 * média do aluno para qualquer condição.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da primeira Nota.");
		float nota1 = sc.nextFloat();

		System.out.println("Digite o valor da segunda Nota.");
		float nota2 = sc.nextFloat();

		System.out.println("Digite o valor da terceira Nota.");
		float nota3 = sc.nextFloat();

		System.out.println("Digite o valor da quarta Nota.");
		float nota4 = sc.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {
			System.out.println("Aluno aprovado com a média de: " + media);
		} else {
			System.out.println("Aluno reprovado com a média de: " + media);
		}
		sc.close();
	}

}
