package app;

import util.ModelException;
import util.QueueEncadeada;
import util.StackArray;

    public class Principal {
        public static void main(String[] args) {
            try {

                StackArray<Integer> pilha = new StackArray<>();
                pilha.push(1);
                pilha.push(2);
                pilha.push(3);
                System.out.println("Topo da pilha: " + pilha.peek()); // 3
                System.out.println("Pop: " + pilha.pop());           // 3
                System.out.println("Novo topo: " + pilha.peek());   // 2

                QueueEncadeada<String> fila = new QueueEncadeada<>();
                fila.enqueue("A");
                fila.enqueue("B");
                fila.enqueue("C");
                System.out.println("Frente da fila: " + fila.front()); // A
                System.out.println("Dequeue: " + fila.dequeue());     // A
                System.out.println("Nova frente: " + fila.front());   // B

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

