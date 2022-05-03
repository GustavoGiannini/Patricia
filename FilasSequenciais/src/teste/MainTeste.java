package teste;

import filas.TipoFilaInt;

public class MainTeste {

	public static void main(String[] args) {

		TipoFilaInt fila = new TipoFilaInt();
		fila.init();
		
		fila.enqueue(66);
		fila.enqueue(17);
		fila.enqueue(32);
		
		if(!fila.isEmpty()) {
			System.out.println("Valor retirado da fila: " + fila.dequeue());			
		}
		
		if(!fila.isEmpty()) {
			System.out.println("Valor retirado da fila: " + fila.dequeue());			
		}
		
		if(!fila.isEmpty()) {
			System.out.println("Valor retirado da fila: " + fila.dequeue());			
		}
		
		if(!fila.isEmpty()) {
			System.out.println("Valor retirado da fila: " + fila.dequeue());			
		}
	}

}
