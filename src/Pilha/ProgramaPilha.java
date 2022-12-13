package Pilha;

public class ProgramaPilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
//		String ArrayList<E> listaPilha= new ArrayList<E>();
		
		pilha.adicionar("ABC");
		pilha.adicionar("DEF");
		pilha.adicionar("GHI");
		pilha.adicionar("JKL");
		
		System.out.println("Primeiro da pilha: " + pilha.get());
		
		//pilha.remover();
		
		System.out.println("Primeiro da pilha: " + pilha.get());
		
		//pilha.remover();
		
		System.out.println("Primeiro da pilha: " + pilha.get());
	}
}
