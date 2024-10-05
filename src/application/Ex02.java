package application;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o turno (N/D): ");
		char turno = sc.next().toUpperCase().charAt(0);
		
		System.out.print("Horas trabalhadas: ");
		short horasTrabalhadas = sc.nextShort();
		
		switch (turno) {
		case 'N' -> System.out.printf("Valor do salário: R$ %.2f", horasTrabalhadas * 45.00);
		case 'D' -> System.out.printf("Valor do salário: R$ %.2f", horasTrabalhadas * 45.00);
		
		default ->
		System.out.println("Valor inválido!");
		}
		
		sc.close();

	}

}
