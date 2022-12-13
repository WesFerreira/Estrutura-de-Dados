package arvore;

public class Arvore<Tipo extends Comparable<Tipo>> {
	
	private ElementoArvore<Tipo> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void adicionar(Tipo valor) {
		ElementoArvore<Tipo> novoElemento = new ElementoArvore<Tipo>(valor);
		if(raiz == null) {
			this.raiz = novoElemento;
		} else {
			ElementoArvore<Tipo> atual = this.raiz;
			while(true) {
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else {
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}
	
	public ElementoArvore<Tipo> getRaiz() {
		return raiz;
	}

	public void percorrer(ElementoArvore<Tipo> atual) {
		if (atual != null) {
			percorrer(atual.getEsquerda());
			System.out.println(atual.getValor());
			percorrer(atual.getDireita());
		}
	}
	
	public boolean remover(Tipo valor) {
		ElementoArvore<Tipo> atual = this.raiz;
		ElementoArvore<Tipo> paiAtual = null;
		while(atual != null) {
			if (atual.getValor().equals(valor)) {
				break;
			} else if (valor.compareTo(atual.getValor()) == -1) {
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		} 
		if (atual != null) {
			//elementoArvore tem dois filhos ou tem filho somente na direita
			if (atual.getDireita() != null) {
				
				ElementoArvore<Tipo> substitutoAtual = atual.getDireita();
				ElementoArvore<Tipo> substitutoPai = atual;
				
				while(substitutoAtual.getEsquerda() != null) {
					substitutoPai = substitutoAtual;
					substitutoAtual = substitutoAtual.getEsquerda();
				}
				substitutoAtual.setEsquerda(atual.getEsquerda());
				
				if(paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substitutoAtual);
					} else {
						paiAtual.setDireita(substitutoAtual);
					}
				} else { //se não tem paiAtual, então ele é a raiz.
					this.raiz = substitutoAtual;
					substitutoPai.setEsquerda(null);
					this.raiz.setDireita(substitutoPai);
					this.raiz.setEsquerda(atual.getEsquerda());
				}
				
				// removeu o elemento da árvore
				if (substitutoAtual.getValor().compareTo(substitutoPai.getValor()) == -1) {
					substitutoPai.setEsquerda(null);
				} else {
					substitutoPai.setDireita(null);
				}
				
			}
			else if (atual.getEsquerda() != null) { //tem filho só na esquerda
				ElementoArvore<Tipo> substitutoAtual = atual.getEsquerda();
				ElementoArvore<Tipo> substitutoPai = atual;
				while(substitutoAtual.getDireita() != null) {
					substitutoPai = substitutoAtual;
					substitutoAtual = substitutoAtual.getDireita();
				}
				if(paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substitutoAtual);
					} else {
						paiAtual.setDireita(substitutoAtual);
					}
				} else {
					this.raiz = substitutoAtual;
				}
				
				// removeu o elemento da árvore
				if (substitutoAtual.getValor().compareTo(substitutoPai.getValor()) == -1) {
					substitutoPai.setEsquerda(null);
				} else {
					substitutoPai.setDireita(null);
				}
				
			} else { //não tem filho
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else {
					this.raiz = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
