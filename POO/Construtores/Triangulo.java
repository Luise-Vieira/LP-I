package Construtores;

public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC);

    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public void setA(double ladoA)
    {
        this.ladoA=ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getA()
    {
        return double ladoA;
    }

    public double getB()
    {
        return double ladoB;
    }

    public double getC()
    {
        return double ladoC;
    }

    public Triangulo(Triangulo outro)
    {
        this.ladoA = outro.ladoA;
        this.ladoB = outro.ladoB;
        this.ladoC = outro.ladoC;
    }
}
