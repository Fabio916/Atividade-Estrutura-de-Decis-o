package application;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Valor de B: ");
		double b = sc.nextDouble();

		System.out.print("Valor de C: ");
		double c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if (delta >= 0) {
			double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
		} else {
			System.out.println("A raíz não pode ser calculada pois o DELTA é negativo.");
		}
		
		sc.close();
	}

}
