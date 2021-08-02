package PacoteJava;

import java.util.Scanner;

public class Exercicio3Aula1 {

	public static void main(String[] args) {
	
		int horas, minutos, segundos, totalSegundos, restoDosSegundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite quanto tempo durou o evento em segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		restoDosSegundos = totalSegundos % 3600;
		minutos = restoDosSegundos / 60;
		segundos = restoDosSegundos % 60;
		
		System.out.println("O evento durou " + horas + " hora " + minutos + " minutos e " + segundos + " segundos");	

	}

}
