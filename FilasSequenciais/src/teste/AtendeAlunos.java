package teste;

import java.util.Scanner;

import filas.TipoFilaInt;

public class AtendeAlunos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = 0;

		TipoFilaInt filaAluno = new TipoFilaInt();
		filaAluno.init();

		while (op != 3) {
			System.out.println(" \n\t 1 - Insere aluno na fila de atendimento");
			System.out.println(" \n\t 2 - Atende aluno");
			System.out.println(" \n\t 3 - Encerra atendimento");
			op = sc.nextInt();

			if (op == 1) {
				System.out.print("Rm: ");
				filaAluno.enqueue(sc.nextInt());
			} else if (op == 2) {
				System.out.println("Rm " + filaAluno.dequeue() + " retirado da fila");
			} else if (op == 3) {
				if (!filaAluno.isEmpty()) {
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
