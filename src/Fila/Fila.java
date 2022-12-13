package Fila;

public class Fila {

	private ListaEncadeada lista;
	
	public Fila() {
		this.lista = new ListaEncadeada();
	}

	public void adicionar(String novoValor) {
		this.lista.adicionar(novoValor);
	}
	
	public String get() {
		return this.lista.getPrimeiro().getValor();
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
		

}
