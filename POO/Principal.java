package POO;

public class Principal {
    //A função Main é a função principal que pode ser executada.
    //Classes sem essa função não podem ser executadas.
    public static void main(String[] args) {
        //Criando um objeto do tipo Aluno
        Aluno a = new Aluno();
        a.inicializa("Fernando", "123");
        a.apresentacao();
        //Consigo acessar a parte publica e ela pode modificar algo na parte privada
        
    }    
}
