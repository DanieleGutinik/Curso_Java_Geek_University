package java_secao03;

import java.util.Scanner;

/* Peça ao usuário para digitar três valores inteiros e imprima a soma deles*/

public class exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int num1, num2, num3, soma;
		
		System.out.print("Digite o primeiro numeros inteiro: ");
		num1 = numero.nextInt();
		
		System.out.print("Digite o Segundo numero inteiro: ");
		num2 = numero.nextInt();
		
		System.out.print("Digite o Terceiro numero inteiro: ");
		num3 = numero.nextInt();
		
		soma = num1+ num2+ num3;
		
		
		System.out.print("A soma dos numeros digitado é: "+ soma);
		
		numero.close();
		
			
		
	}

}
