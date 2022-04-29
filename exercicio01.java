package java_secao03;

import java.util.Scanner;

/* Faça um programa que leia um número inteiro e o imprima*/

public class exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		
		System.out.print("Digite um numero real: ");
		
		int numero = num1.nextInt();
		
		System.out.println("O valor digitado é " + numero);	
		
		num1.close();
		
	}

}
