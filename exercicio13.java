package java_secao03;

import java.util.Scanner;

/*Leia um �ngulo em graus e apresente - o convertido em radianos. A f�rmula de convers�o
 * � R = G * PI/180, sendo G o �ngulo em graus de R em radianos e PI = 3.14. */

public class exercicio13 {
	
	public static void main(String[] args) {
		
		double grau, radiano;
		Scanner angulo = new Scanner (System.in);
		
		System.out.print("Informe o �ngulo em graus: ");
		grau = angulo.nextDouble();
		
		radiano = grau * 3.14/180;
		
		System.out.println("O valor do Radiano �: " + radiano );
		
		
		angulo.close();
		
		
	}

}
