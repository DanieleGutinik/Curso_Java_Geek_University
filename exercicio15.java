package java_secao03;

import java.util.Scanner;

/*Leia um �ngulo em radianos e apresente- o convertido em graus. A f�rmula de convers�o �:
 * G = R * 180 /PI, sendo G o �ngulo em graus e R em radianos em PI = 3.14. */

public class exercicio15 {
	
	public static void main(String[] args) {
		
		double radiano, graus, conversao_grau;
		Scanner angulo_R = new Scanner (System.in);
		
		System.out.print("Digite o valor do �ngulo: ");
		radiano = angulo_R.nextDouble();
		
		graus = radiano * 180 / 3.14;
		
		System.out.println("O valor do radiano �: " + graus );
		
		angulo_R.close();
		
	}

}
