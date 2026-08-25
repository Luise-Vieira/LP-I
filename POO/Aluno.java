package POO;

public class Aluno {

    //atributos
    private String nome;
    private String RA;

    //Tipo de dados-> quando se cria uma classe esta definindo como deve ser um objeto


    //Metodos (funções)
    public void inicializa(String nome, String RA)
    {
        this.nome=nome; //oq vem como paramentro é guardado la em cima
        this.RA=RA;
    }

    public void apresentacao()
    {
        System.out.println("Ola! Eu sou "+ this.nome + ". Meu RA é: " + this.RA);
    }
}
