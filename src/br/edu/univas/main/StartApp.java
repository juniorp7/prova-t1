package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valorJoao = 0;
		int valorMaria = 0;
		
		for (int i = 1; i <=8; i++) {
			System.out.println("Valor do item: " + i);
			int valorItem = sc.nextInt();
			int metade = valorItem / 2;
			valorJoao += metade;
			valorMaria += metade;
		}
		System.out.println("Valor do item: 9");
		int valorItem = sc.nextInt();
		valorJoao += valorItem;
		
		System.out.println("Maria vai pagar: R$" + valorMaria);
		System.out.println("João vai pagar: R$" + valorJoao);
		sc.close();
	}

}
