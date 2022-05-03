package exercicios;

import java.util.Scanner;

import filas.FilaString;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FilaString fila = new FilaString();
		int op;
		fila.init();
		do {
			System.out.println(" 1 - Insere 1 paciente na fila");
			System.out.println(" 2 - Chama 1 paciente da fila");
			System.out.println(" 3 - Encerra atendimentos");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Nome do paciente: ");
				String nome = sc.next();
				//Insere o nome do paciente na fila
				fila.enqueue(nome);
				break;
			case 2:
				if(!fila.isEmpty()) {
					System.out.println("Venha para a sala 3 " + fila.dequeue());					
				} else {
					System.out.println("Sem pacientes na fila");
				}
				break;
			case 3:
				if(!fila.isEmpty()) {
					System.out.println("Ainda há pacientes na fila");
				} else {
					System.out.println("Sistema encerrado!");										
				}
				break;
			default:
				System.out.println("Opção inválida");
			}
		}while(op != 3);
		
		sc.close();
		
	}
}
