package application;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor da bolsa: ");
		double valorBolsa = sc.nextDouble();

		System.out.print("Informe o tempo de estágio: (em anos)");
		int tempoEstagio = sc.nextInt();

		if (valorBolsa >= 750.00 && valorBolsa <= 950.00) {
			if (tempoEstagio >= 2) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
		} else {
			System.out.println("Reprovado!");
		}

		sc.close();
	}

}
