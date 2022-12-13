package arvore;

public class ProgramaArvore {
	
	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(20);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(5);
		
		arvore.percorrer(arvore.getRaiz());		
		System.out.println("--------------------------");
		
		arvore.remover(10);
		arvore.percorrer(arvore.getRaiz());
		
		System.out.println("--------------------------");
//		
//		arvore.remover(5);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");
//
//		arvore.remover(8);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");
//		
//		arvore.remover(9);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");
//		
//		arvore.remover(13);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");
//		
//		arvore.remover(7);
//		arvore.remover(18);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");
//		
//		arvore.remover(20);
//		arvore.percorrer(arvore.getRaiz());
//		System.out.println("--------------------------");

	}
}
