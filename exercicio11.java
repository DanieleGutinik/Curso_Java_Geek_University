package java_secao03;

import java.util.Scanner;

/*Leia uma velocidade em m/s(metro por segundo ) e apresente-a convertida em km/h (quilômetros por hora).
 * a fórmula de conversão é K = M* 3.6, sendo K a velocidade em km/h e M em m/s */
public class exercicio11 {
	
	public static void main(String[] args){
		
		double velocidade, conversao;
		Scanner quilometro = new Scanner(System.in);
		
		System.out.print("Informe a velocidade: ");
		conversao = quilometro.nextDouble();
		
		velocidade = conversao * 3.6;
		
		System.out.println("A velocidade convertida em km/h é:"+ velocidade);
		
		
	}

}
