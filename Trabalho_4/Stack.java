import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int n;

    public Stack() {// Construtor
        this.top = null;
        this.n = 0;
    }

    public void push(int item) {// empilha
        Node t = new Node();
        t.setItem(item); // insere o valor de "item" na caixinha
        t.setNext(this.top); // next de t liga na caixinha top
        this.top = t; // o t passa a ser top
        this.n++;
    }

    public int pop() {// desempilha
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int x = this.top.getItem();
        this.top = this.top.getNext();
        this.n--;
        return x;
    }

    public int getTop() {// retorna elemento do topo
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        return this.top.getItem();
    }

    public int size() {// retorna o tamanho
        return this.n;
    }

    public boolean isEmpty() {// mostra se esta vazio
        return this.n == 0;
    }

    public void clear() {// limpa a pilha
        this.top = null;
        this.n = 0;
    }

    public void show() {// mostra os elementos da pilha
        Node t = this.top;
        while (t != null) // enquanto t não for nulo
        {
            System.out.print(t.getItem() + " ");
            t = t.getNext(); // aqui o t vai andando nas caixinhas até chegar em null
        }
        System.out.println(); // aqui é só para pular de linha
    }

}