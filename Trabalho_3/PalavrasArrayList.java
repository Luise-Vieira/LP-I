import java.util.ArrayList;

public class PalavrasArrayList {
    private ArrayList<String> palavras;

    public PalavrasArrayList() // Construtor
    { // cria um conjunto vazio
        this.palavras = new ArrayList<>();
    }

    public void inserir(String p) {
        this.palavras.add(p);
    }

    public void exibir() {
        for (int i = 0; i < this.palavras.size(); i++) {
            System.out.println(this.palavras.get(i));
        }

    }

    public String getPalavra(int idx) {
        if (idx < 0 || idx >= this.palavras.size()) {
            System.out.println("Erro: indice invalido.");
            return "erro";
        }

        return this.palavras.get(idx);
    }
}
