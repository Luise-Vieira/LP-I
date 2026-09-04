package Construtores;

public class Ponto {
    private double x;
    private double y;

    public Ponto() // Construtor sem parametro inicia em zero
    {
        System.out.println("Construtor sem parametros");
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y)// Construtor vai receber o valor que veio no parametro
    {
        System.out.println("Construtor com parametros");
        this.x = x;
        this.y = y;
    }

    public void setX(double x) // Atribuir ao x um valor sem mudar o y
    {
        this.x = x;
    }

    public void setY(double y) // Atribuir ao y um valor sem mudar o x
    {
        this.y = y;
    }

    public double getX() { //metodo para retornar, se vc usar o getY() e dar enter ele ja cria essa estrutura pq é padrao da linguagem.
        return x;
    }

    public double getY() {
        return y;
    }

    //Construtor de copia serve para copiar objetos

    public Ponto (Ponto outro) //recebe como paramentro outro ponto
    {
        this.x=outro.x; 
        this.y=outro.y;
    }
}
