package exercicios;

import java.util.Scanner;

import filas.FilaInt;

public class Exercicio1 {

	public static void main(String[] args) {
		
		FilaInt fila = new FilaInt();
		fila.init();
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Informe valor positivo para enfileirar ou " 
				+ "negativo para encerrar");
		valor = sc.nextInt();
		while (valor>=0) {
			fila.enqueue(valor);
			System.out.println("Informe valor positivo para enfileirar ou " 
					+ "negativo para encerrar");
			valor = sc.nextInt();
		}
		while(!fila.isEmpty()) {
			System.out.println("Valor retirado: " + fila.dequeue());
		}
		
		sc.close();
		
	}
}
