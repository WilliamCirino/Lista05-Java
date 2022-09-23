package lista5;

import java.util.Scanner;

public class Exercício4 {

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

		if (media >= 7) {
			System.out.println("Aluno aprovado com a média de: " + media);
		} else {
			System.out.println("Digite o valor da nota do Exame Auxiliar");
			float exame = sc.nextFloat();
			float media2 = (media + exame) / 2;
			if (media2 > 5) {
				System.out.println("Aluno aprovado com a média de: " + media2);
			} else {
				System.out.println("Aluno reprovado com a média de: " + media2);
			}
		}
		sc.close();

	}

}
