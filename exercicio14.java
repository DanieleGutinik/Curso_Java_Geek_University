package java_secao03;

import java.util.Scanner;

/*Leia uma dist�ncia em quil�metros e apresente a convertida em milhas. A f�rmula de 
 * convers�o � M: k / 1.61, sendo K a dist�ncia em quil�metro de M em milhas.*/

public class exercicio14 {
	
	public static void main(String[] args){
		double milhas, conversao, quilometro_D;
		Scanner quilometro = new Scanner(System.in);
		
		System.out.print("Digite a dist�ncia em quil�mentro: ");
		
		quilometro_D = quilometro.nextDouble();
		
		milhas = quilometro_D /1.61;
		
		System.out.println("A dist�ncia em quil�metro de milhas �: "+ milhas);
		
		quilometro.close();
				
		
	}
	

}
