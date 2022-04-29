package java_secao03;
/*Leia um numero real e imprima a quinta parte deste número */

import java.util.Scanner;

public class exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner num_Quad = new Scanner(System.in);
		double numero, resultado;
		
		System.out.print("Digite um numero real: ");
		numero = num_Quad.nextDouble();
		
		resultado = numero / 5;
		
		System.out.print("A quinta parte deste número é: "+ resultado);
		
		
	}

}
