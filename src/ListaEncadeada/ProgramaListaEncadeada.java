package ListaEncadeada;

public class ProgramaListaEncadeada {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//adicionando valores a lista
		lista.adicionar("PB");
		lista.adicionar("RN");
		lista.adicionar("AM");
		lista.adicionar("RJ");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		
		//printando toda a lista um por um pelo seu indice
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
		lista.adicionar("ES");
		
		System.out.println(lista.getTamanho());
		
		//printando toda a lista usando for
		for(int i=0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}System.out.println("---------------------------");

		
		//removendo valores da lista
		lista.remover("PB");
		System.out.println("Removeu estado escolhido");
		
		System.out.println(lista.get(0).getValor());

		
//		//adicioando valores na lista
//		lista.adicionar("GO");
//		System.out.println("Adicionando estado escolhido");
//		
//		//removendo todos os valores da lista
//		lista.remover("RN");
//		lista.remover("AM");
//		lista.remover("RJ");
//		lista.remover("ES");
//		lista.remover("GO");
//		
//		System.out.println("Tamanho: " + lista.getTamanho());
//		for(int i=0; i < lista.getTamanho(); i++) {
//			System.out.println(lista.get(i).getValor());
//		}
//		
//		
	}
}
