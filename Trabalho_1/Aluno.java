public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    // Armazenar nome
    public void armazenarNome(String nome) {
        this.nome = nome;
    }

    public String Getnome() {
        return nome;
    }
    // armazenar as notas dos alunos;

    public void armazenarnotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    // calcular a média das notas;

    public double media() {
        double Media = (this.nota1 + this.nota2 + this.nota3) / 3;
        return Media;
    }
    // verificar, usando uma estrutura de decisão, se o aluno está aprovado

    public void aprovado() {
        double Media = media();
        if (Media >= 60)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

    }
}
