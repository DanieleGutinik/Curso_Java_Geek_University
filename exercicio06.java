package java_secao03;

import java.util.Scanner;

/* Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahre heit.
 * A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e 
 * C a temperatura em Celsius.*/

public class exercicio06 {
	
	public static void main(String[]args) {
		Scanner temperatura = new Scanner(System.in);
		double graus, celsius, formula;
		
		System.out.print("Digite a temperatura atual: ");		
		graus = temperatura.nextDouble();
		
		celsius = graus * (9.0 / 5.0) + 32.0;
		
		System.out.print("A Temperatura em Fahrenheit é: " + celsius);
		
		
		
		
	}
}
