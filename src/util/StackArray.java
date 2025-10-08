package util;

public class StackArray<T> {

    private ListaEncadeada<T> lista;

    public StackArray() {
        lista = new ListaEncadeada<>();
    }

    public void push(T elemento) {
        lista.adicionar(elemento);
    }

    public T pop() {
        return lista.removerUltimo();
    }

    public T peek() {
        return lista.pegarUltimo();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }
}
