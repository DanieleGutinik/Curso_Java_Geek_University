package java_secao03;

import java.util.Scanner;

/*Leia uma velocidade em m/s(metro por segundo ) e apresente-a convertida em km/h (quil�metros por hora).
 * a f�rmula de convers�o � K = M* 3.6, sendo K a velocidade em km/h e M em m/s */
public class exercicio11 {
	
	public static void main(String[] args){
		
		double velocidade, conversao;
		Scanner quilometro = new Scanner(System.in);
		
		System.out.print("Informe a velocidade: ");
		conversao = quilometro.nextDouble();
		
		velocidade = conversao * 3.6;
		
		System.out.println("A velocidade convertida em km/h �:"+ velocidade);
		
		
	}

}
