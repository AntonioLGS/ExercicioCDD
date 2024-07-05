package Extra;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// Exercícios
		/*
		 * 4. compare os 2 textos abaixo e diga se são iguais. String texto01 =
		 * "Será que são iguais?"; String texto02 = "Será que são iguais?";
		 */
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		boolean inguais = texto01.equals(texto02);
		System.out.println(inguais);

		/*
		 * 5. Faça um programa que receba de um usuário, um texto e exiba esse texto em
		 * letras maiúsculas
		 */
		String entrUsuario;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva algo para sair maiscúlo: ");
		entrUsuario = entrada.nextLine();
		entrada.close();
		String upper = entrUsuario.toUpperCase();
		System.out.println(upper);
		System.out.println();

		/*
		 * 6. dado o Array a seguir, {"a", "vida", "é", "bela"} faça um programa que
		 * crie um string o com texto retirado do Array e imprima. no seguinte formato.
		 * A VIDA É BELA
		 */
		String[] array = { "a", "vida", "é", "bela" };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].toUpperCase());
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

	/*
	 * 7. Refaça o exercício anterior, usando a maneira como o Mestre yoda falaria..
	 * BELA É VIDA A
	 */
	String[] arra = { "a", "vida", "é", "bela" };

    for (int e = arra.length - 1; e >= 0; e--) {
        System.out.print(arra[e].toUpperCase());
        if (e > 0) {
            System.out.print(" ");
        }
    }
    System.out.println();
}
}
