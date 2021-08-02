package PacoteJava;

import java.util.Scanner;

public class Exercicio6Aula1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d, p1, p2;
		
		System.out.println("Digite o valor de X1");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de X2");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de Y1");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de Y2");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		//%f - double
		//%d - inteiro
		//%s String
		//%b boolean
		
		System.out.printf("\n(modo direto) A distância é %.3f ",d);//printf imprime arrendodado e só trabalha com , substitui valores marcados no printf

	}

}
