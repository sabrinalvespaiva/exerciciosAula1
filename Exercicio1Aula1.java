package PacoteJava;

import java.util.Scanner;

public class Exercicio1Aula1 {
	
	public static void main(String args[]) {
		
	Scanner leia = new Scanner(System.in);
	int totalDias, anos, meses, dias; 
	
	System.out.println("Digite quantos anos voce tem: ");
	anos = leia.nextInt();
	System.out.println("Digite o numero do mês atual: ");
	meses = leia.nextInt();	
	System.out.println("Digite o dia atual do mês: ");
	dias = leia.nextInt();
	
	totalDias = (anos * 365) + (meses * 30) + dias;
	
	System.out.println("Sua idade em dias é: " + totalDias);
	
	}
	

}
