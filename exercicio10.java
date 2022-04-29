package java_secao03;

import java.util.Scanner;

/* Leia uma velocidade em km/h(quilômetros por hora) e apresente-a convertida em m/s
 * (metros por segundo).A fórmula de conversão é M = K/3.6, sendo K a velocidade em
 * Km/h e M em m/s
 * */

public class exercicio10 {
	
	public static void main(String[] args) {
	
	double velocidade, quilometro, conversao, conversao_M, conversao_Q;
	Scanner conversao_K = new Scanner(System.in);
	
	
	System.out.print("Digite a velocidade em Km/h: ");
	conversao_Q = conversao_K.nextDouble();
	
	conversao_M = conversao_Q / 3.6;

	System.out.print("A velocidade convertida é m/s: " + conversao_M);
		
			
		
	}

}
