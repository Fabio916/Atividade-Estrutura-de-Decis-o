package application;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		if (n >= 0 && n <= 9) {
			System.out.println("Valor correto");
		}
		else {
			System.out.println("Valor incorreto!");
		}
		
		sc.close();
	}

}
