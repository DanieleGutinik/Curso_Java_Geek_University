package java_secao03;

import java.util.Scanner;

/* Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
 * A fórmula de conversão é: k = C + 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin*/


public class exercicio09 {
	
	public static void main(String[]args) {
		
		double resultado, celsius;
		Scanner temperatura_c = new Scanner(System.in);
		
		System.out.print("Digite a tmperatura: ");
		celsius = temperatura_c.nextDouble();
		
		resultado = celsius + 273.15;
		
		System.out.print("A Temperatura Kelvin é: "+ resultado);
		
		temperatura_c.close();
				
		
	}

}
