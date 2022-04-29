package java_secao03;

import java.util.Scanner;

/* Leia uma temperatura em graus Fahrenheit e apresente -a convertida em graus Celsius.
 * A fórmula de conversão é : C = 5.0 * (f - 32.0)/9.0, sendo C a temperatura em celcius e F
 * temperatura em fanhrenheit.  */

public class exercicio07 {
	
	public static void main(String[] args){
		
		Scanner formula = new  Scanner(System.in);
		double grau_1, resultado, formula_2;
		
		System.out.print("Digite a temperatura: ");
		
		grau_1 = formula.nextDouble();
			
		formula_2 = 5.0 * (grau_1 - 32.0)/9.0;
				
		System.out.print("A temperatura em Fahrenheit é " + formula_2);
		
				
		formula.close();		
		
		
		
	}

}
