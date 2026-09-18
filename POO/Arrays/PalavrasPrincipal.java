package Arrays;

public class PalavrasPrincipal {
    public static void main(String[] args) {
        Palavras p = new Palavras();
        p.inserir("uva");
        p.inserir("maca");
        p.inserir("Laranja");
        p.inserir("Melancia");
        p.exibir();
        String f = p.getPalavra(2);
        System.out.println(f);
        String z = p.getPalavra(20);
        System.out.println(z);
    }
    
}
