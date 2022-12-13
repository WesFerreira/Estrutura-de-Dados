package arvore;

public class ElementoArvore<Tipo> {
	private Tipo valor;
	private ElementoArvore<Tipo> esquerda;
	private ElementoArvore<Tipo> direita;

	public ElementoArvore(Tipo novoValor) {
		this.valor = novoValor;
		this.esquerda = null;
		this.direita = null;
	}

	public Tipo getValor() {
		return valor;
	}

	public void setValor(Tipo valor) {
		this.valor = valor;
	}

	public ElementoArvore<Tipo> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ElementoArvore<Tipo> esquerda) {
		this.esquerda = esquerda;
	}

	public ElementoArvore<Tipo> getDireita() {
		return direita;
	}

	public void setDireita(ElementoArvore<Tipo> direita) {
		this.direita = direita;
	}
}
