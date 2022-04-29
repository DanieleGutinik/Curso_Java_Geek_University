package java_secao03;

import java.util.Scanner;

/*Leia um número real e imprima o resultado do quadrado desse número.*/

public class exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		int numero, resultado;
		
		System.out.print("Digite o numero real: ");
		numero = num.nextInt();
		
		resultado = numero * numero;
		
		System.out.print("O resultado do quadrado do número é "+ resultado);
		
	}


}
