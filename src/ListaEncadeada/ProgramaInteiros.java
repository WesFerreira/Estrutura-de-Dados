package ListaEncadeada;

public class ProgramaInteiros {
	
	public static void main(String[] args) {
		ListaEncadeada<Integer> numeros = new ListaEncadeada<Integer>();
		numeros.adicionar(8);
		numeros.adicionar(13);
		numeros.adicionar(25);
		numeros.adicionar(9);
		
		System.out.println("Tamanho: " + numeros.getTamanho());
		for(int i=0; i < numeros.getTamanho(); i++) {
			System.out.println(numeros.get(i).getValor());
		}	
	}
}
