package java_secao03;

import java.util.Scanner;

/* Peça ao usuário para digitar três valores inteiros e imprima a soma deles*/

public class exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		Scanner num3 = new Scanner(System.in);
		
		System.out.print("Digite três numeros inteiro seguenciais: ");
		
		int numero1 = num1.nextInt();
		int numero2 = num2.nextInt();
		int numero3 = num3.nextInt();
		
		int soma = numero1+ numero2+ numero3;
		
		
		System.out.print("A soma dos numeros digitado é: "+ soma);
		
			
		
	}

}
