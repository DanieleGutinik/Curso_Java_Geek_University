package java_secao03;

import java.util.Scanner;

/*Leia um valor de comprimento e apresente - o convertido em graus em cent�metros.
 * A f�rmula de convers�o � C = P* 2,54, sendo C o comprimento em cent�metro e P o 
 * comprimento em polegadas.*/

public class exercicio16 {
	
	public static void main(String [] args) {
		
	double comprimento, convertido, polegada_2;
	Scanner polegada = new Scanner(System.in);
	
	System.out.print("Digite o valor da Polegada: ");
	
	polegada_2 = polegada.nextDouble();
	comprimento = polegada_2 * 2.54;
	
	System.out.println("O valor convertido em cent�metros �: " + comprimento);
	
	polegada.close();
	
	}

}
