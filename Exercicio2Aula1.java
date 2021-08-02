package PacoteJava;

import java.util.Scanner;

public class Exercicio2Aula1 {
	
	public static void main(String args[]) {
		
	
	Scanner leia = new Scanner(System.in);
	int totalDias, anos, meses, dias; 
	
	System.out.println("Digite sua idade em dias: ");
	totalDias = leia.nextInt();
	
	anos = totalDias / 365;
	meses = totalDias % 365;
	dias = meses / 30;
	
	System.out.println("Sua idade em meses é " + meses);
	System.out.println("Sua idade em anos é " + anos);
	System.out.println("Sua idade em dias é: " + totalDias);
		
	}

}
