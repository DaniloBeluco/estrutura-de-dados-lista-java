
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ListaSimples lista = new ListaSimples();
    lista.inserePrimeiroElemento("A");
    lista.inserePrimeiroElemento("X");   
    lista.insereUltimoElemento("D");
    lista.insereUltimoElemento("C");
    lista.removeNaPosicao(2);
    //lista.insereNaPosicao("BBB", 0);
    //lista.removePrimeiro();
    
    
    System.out.println(lista.mostraNaPosicao(0));
    System.out.println(lista.mostraNaPosicao(1));
    System.out.println(lista.mostraNaPosicao(2));
    //System.out.println(lista.mostraNaPosicao(3));
    System.out.println(lista.tamanho());
   
    
	}

}
