package java_secao03;

import java.util.Scanner;

/* Fa�a um programa que leia um n�mero inteiro e o imprima*/

public class exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		
		System.out.print("Digite um numero real: ");
		
		int numero = num1.nextInt();
		
		System.out.println("O valor digitado � " + numero);	
		
		num1.close();
		
	}

}
