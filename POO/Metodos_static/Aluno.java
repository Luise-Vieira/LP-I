package Metodos_static;

public class Aluno {
    public static int qtd=0; //Pertence a classe, não ao objeto

    public static void mostraQtd ()
    {
        System.out.println("A quantidade de alunos é " + Aluno.qtd);
    }
    
    private int codigo; //Atributos de instancia. Pertencem ao objeto
    private String nome; 

    public Aluno (int codigo, String nome) //construtor
    {
        this.codigo=codigo;
        this.nome=nome;

        Aluno.qtd++; //this é do objeto, p/ localizar melhor se usa o nome da classe 

    }

    public  void mostraAluno()
    {
        System.out.println("Codigo:" + this.codigo);
        System.out.println("Nome:" + this.nome);
    }
}

