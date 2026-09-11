package Metodos_static;

public class Principal {

   public static void main(String[] args) {
    
    Aluno a1 = new Aluno(1, "Luise");
    Aluno a2 = new Aluno(2, "Ana");
    Aluno a3 = new Aluno(3, "Davi");
    // System.out.println(Aluno.qtd); //Jeito de acessa o atributo estatico da classe
    Aluno.mostraQtd();
    a1.mostraAluno();
    a2.mostraAluno();
    a3.mostraAluno();

    System.out.println(Operacaoes.soma(10, 20));
   }
    
}
