import java.util.Scanner;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do ALuno:\n ");
        String nome = input.nextLine();
        aluno.armazenarNome(nome);

        System.out.println("Digite a primeira nota:\n");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota:\n");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota:\n");
        double nota3 = input.nextDouble();

        aluno.armazenarnotas(nota1, nota2, nota3);

        System.out.println( "Aluno" + aluno.Getnome() + "com media de : " + aluno.media() );
        aluno.media();
        aluno.aprovado();

        input.close();

    }

}
