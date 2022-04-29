package java_secao03;

import java.util.Scanner;

/*Faça um programa que leia um número real e o imprima. */

public class exercicio02 {
	
	public static void main(String[]args) {
		
		Scanner num1 = new Scanner(System.in);
		
		System.out.print("Digite um numero real: ");
		
		float numero = num1.nextFloat();
		
		System.out.println("O numero Digitado " + numero);
			
		
	}

}
