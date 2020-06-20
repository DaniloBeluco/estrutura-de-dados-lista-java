
public class ListaSimples {

	private No atual, primeiro, ultimo;

	public ListaSimples() {
		atual = primeiro = ultimo = null;
	}

	public boolean estaVazio() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	public void inserePrimeiroElemento(String e) {
		No novo = new No(e);

		if (estaVazio()) {
			atual = novo;
			primeiro = novo;
			ultimo = novo;
		} else {
			novo.proximo = primeiro;
			primeiro = novo;
		}
	}

	public void insereUltimoElemento(String e) {
		No novo = new No(e);

		if (estaVazio()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
	}

	public String mostraNaPosicao(int p) {
		moveParaPosicao(p);
		return atual.elemento;
	}

	public void moveParaPosicao(int p) {
		atual = primeiro;

		for (int i = 0; i < p; i++) {
			atual = atual.proximo;
		}
	}

	public void insereNaPosicao(String e, int p) {
		No novo = new No(e);

		moveParaPosicao(p);			
		novo.proximo = atual.proximo;
		atual.proximo = novo;
		
		
	}

	public String primeiro() {
		return primeiro.elemento;
	}

	public void removePrimeiro() {
		primeiro = primeiro.proximo;
	}

	public void removeUltimo() {
        int pos = quantidade() - 1;
		moveParaPosicao(pos);
		atual.proximo = null;
		ultimo = atual;
	}
	
	public void removeNaPosicao(int p) {
		No temp;
		moveParaPosicao(p);
		temp = atual;
		moveParaPosicao(p-1);
		atual.proximo = temp.proximo;
	}

	public int quantidade() {
		int q = 0;
		atual = primeiro;
		while (atual != null) {
			q++;
			atual=atual.proximo;
		}

		return q;
	}
	public int tamanho() {
		int q = 1;
		No aux = primeiro;
		while (aux.proximo != null) {
			q++;
			aux=aux.proximo;
		}

		return q;
	}

}
