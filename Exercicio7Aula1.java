package PacoteJava;

import java.util.Scanner;

public class Exercicio7Aula1 {

	public static void main(String[] args) {
	
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de X � : " + x + "\n O valor de y �: " + y);
		
	}

}
