package util;

public class ListaEncadeada<T> {

    private class No<T> {
        T dado;
        No<T> proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        No<T> novo = new No<>(elemento);
        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public T removerUltimo() {
        if (inicio == null) return null;

        if (inicio.proximo == null) {
            T dado = inicio.dado;
            inicio = null;
            tamanho--;
            return dado;
        }

        No<T> atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        T dado = atual.proximo.dado;
        atual.proximo = null;
        tamanho--;
        return dado;
    }

    public T removerPrimeiro() {
        if (inicio == null) return null;
        T dado = inicio.dado;
        inicio = inicio.proximo;
        tamanho--;
        return dado;
    }

    public T pegarUltimo() {
        if (inicio == null) return null;
        No<T> atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    public T pegarPrimeiro() {
        if (inicio == null) return null;
        return inicio.dado;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }
}
