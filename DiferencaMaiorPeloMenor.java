package lista5;

import java.util.Scanner;
// Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.
 
public class DiferencaMaiorPeloMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor.");
		int valor1 = sc.nextInt();

		System.out.println("Digite o primeiro valor.");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("A diferença entre o números lidos é " + (valor1 - valor2));
		} else {
			System.out.println("A diferença entre o números lidos é " + (valor2 - valor1));
		}
		sc.close();
	}

}
