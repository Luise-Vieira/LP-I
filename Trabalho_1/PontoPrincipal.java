public class PontoPrincipal {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        p1.definirPontos(2, 4);
        p2.definirPontos(5, 10);
        p1.exibirCood();
        p2.exibirCood();
        p1.distanciaPontos(p2);
        
    }
    
}
