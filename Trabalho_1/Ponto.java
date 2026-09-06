public class Ponto {
    private double x;
    private double y;

    // definir e acessar os valores de x e y
    public void definirPontos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // exibir as coordenadas de um ponto.[
    public void exibirCood() {
        System.out.println("X :" + this.x + "Y: " + this.y);
    }

    // calcular a distância entre dois pontos
    public double distanciaPontos(Ponto p) {
        double d; // distancia
        d = Math.sqrt( // Raiz quadrada
                Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2)); // Math.pow é pra potenciação
                System.out.println("A distancia entre os pontos é de:" + d);
        return d;
    }

}
