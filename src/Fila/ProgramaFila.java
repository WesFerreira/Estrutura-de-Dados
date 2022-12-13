package Fila;

public class ProgramaFila {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar("ABC");
		fila.adicionar("DEF");
		fila.adicionar("GHI");
		fila.adicionar("JKL");
		
		System.out.println("Primeiro da fila: " + fila.get());
		fila.remover();
		System.out.println("Primeiro da fila: " + fila.get());

	}
}
