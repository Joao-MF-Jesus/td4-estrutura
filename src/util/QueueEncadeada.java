package util;

public class QueueEncadeada<T> {

    private ListaEncadeada<T> lista;

    public QueueEncadeada() {
        lista = new ListaEncadeada<>();
    }

    public void enqueue(T elemento) {
        lista.adicionar(elemento);
    }

    public T dequeue() {
        return lista.removerPrimeiro();
    }

    public T front() {
        return lista.pegarPrimeiro();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }
}

