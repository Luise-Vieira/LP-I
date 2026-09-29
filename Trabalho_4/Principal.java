import java.util.EmptyStackException;

public class Principal {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        try {
            for (int i = 0; i < 4; i++) {
                s.pop();
                s.show();
            }
        }

        catch (EmptyStackException e) {
            System.out.println("Erro: Pilha vazia." + e.getMessage());
        }

    }

}
