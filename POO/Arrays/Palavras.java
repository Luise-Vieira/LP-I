package Arrays;

public class Palavras {
    private final int MAXTAM = 50;
    private String[] palavras; // aq foi definido uma referencia pro vetor
    private int n;// indica a pos do proximo e quantos itens temos.

    public Palavras() // Construtor
    { // cria um conjunto vazio
        this.n = 0;
        this.palavras = new String[MAXTAM];
    }

    public void inserir(String p) {
        if (n >= MAXTAM) {
            System.out.println("ERRO: o array esta cheio! \n");
            return;
        }
        this.palavras[this.n] = p;
        this.n++;
    }

    public void exibir() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.palavras[i]);
        }

    }

    public String getPalavra(int idx) {
        if (idx < 0 || idx >= this.n)
        {
            System.out.println("Erro: indice invalido.");
            return "erro";
        }

        return this.palavras[idx];
    }
}