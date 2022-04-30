package java_secao03;

import java.util.Scanner;

/*Leia uma distância em quilômetros e apresente a convertida em milhas. A fórmula de 
 * conversão é M: k / 1.61, sendo K a distância em quilômetro de M em milhas.*/

public class exercicio14 {
	
	public static void main(String[] args){
		double milhas, conversao, quilometro_D;
		Scanner quilometro = new Scanner(System.in);
		
		System.out.print("Digite a distância em quilômentro: ");
		
		quilometro_D = quilometro.nextDouble();
		
		milhas = quilometro_D /1.61;
		
		System.out.println("A distância em quilômetro de milhas é: "+ milhas);
		
		quilometro.close();
				
		
	}
	

}
