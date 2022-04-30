package java_secao03;

import java.util.Scanner;

/*Leia um ângulo em radianos e apresente- o convertido em graus. A fórmula de conversão é:
 * G = R * 180 /PI, sendo G o ângulo em graus e R em radianos em PI = 3.14. */

public class exercicio15 {
	
	public static void main(String[] args) {
		
		double radiano, graus, conversao_grau;
		Scanner angulo_R = new Scanner (System.in);
		
		System.out.print("Digite o valor do ângulo: ");
		radiano = angulo_R.nextDouble();
		
		graus = radiano * 180 / 3.14;
		
		System.out.println("O valor do radiano é: " + graus );
		
		angulo_R.close();
		
	}

}
