public class Excecoes4 {

    public static void verificarIdade(int idade)
    {
        if (idade < 18)
        {
            throw new IllegalArgumentException("Menores de 18 nao sao permitidos. ");//cria uma nova exececao
        }
        System.out.println("Acesso permitido ");
    }
    public static void main(String[] args) {
        try 
        {
            verificarIdade(16);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
