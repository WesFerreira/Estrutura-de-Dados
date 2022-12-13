package Pilha;

public class Pilha {
	
	private ListaEncadeada lista;
	
	public Pilha() {
		this.lista = new ListaEncadeada();
	}
	
	public void adicionar(String novoValor) {
		this.lista.adicionarNoComeco(novoValor);
	}
	
	public String get() {
		return this.lista.getPrimeiro().getValor();
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	@Override
	public String toString() {
		return this.get();
	}
}
