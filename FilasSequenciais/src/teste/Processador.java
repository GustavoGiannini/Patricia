package teste;

import java.util.Scanner;

import filas.TipoFilaInt;

public class Processador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = 0;
		int opProces, processo;

		TipoFilaInt filaProcessos = new TipoFilaInt();
		filaProcessos.init();

		while (op != 3) {
			System.out.println(" \n\t 1 - Subeter processo");
			System.out.println(" \n\t 2 - Processar");
			System.out.println(" \n\t 3 - Encerrar Programa");
			op = sc.nextInt();

			if (op == 1) {
				System.out.print("PID: ");
				filaProcessos.enqueue(sc.nextInt());
			} else if (op == 2) {
				
				processo = filaProcessos.dequeue();
				
				System.out.println("PID " + processo + " retirado da fila");					
				System.out.println("O processo foi encerrado?(1-Sim; 2-Não)");
				opProces = sc.nextInt();
				
				if(opProces == 1) {
					System.out.println("Porcesso Concluído");
				}
				else {
					filaProcessos.enqueue(processo);
				} 
				
			} else if (op == 3) {
				if (!filaProcessos.isEmpty()) {
					System.out.println("A fila não está vazia!");
					op = 0;
				} else {
					System.out.println("Fila encerrada!");
				}
			} else {
				System.out.println("Digite uma opção válida!");
			}

		}

		sc.close();
	}

}
