package tarefa06;

import java.util.Scanner;

/*4. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
 *se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com o 
 *valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado 
 *em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar com as mensagens o valor da média 
 *do aluno, para qualquer condição.
 */
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
				System.out.println("Aluno aprovado em exame com a média de: " + media2);
			} else {
				System.out.println("Aluno reprovado em exame com a média de: " + media2);
			}
		}
		sc.close();

	}

}
