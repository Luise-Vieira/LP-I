public class Excecoes2 {
    public static void main(String[] args) {
        try{ //tente isso
            int [] numeros  = {10,20,30};
            System.out.println(numeros[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) //caso tenha dado erro faça isso
        {
            System.out.println("Indice fora dos limites. " + e.getMessage());
        }
        finally
        {
            System.out.println("Esse bloco sempre sera executado. "); //sempre é executado ocorrendo erro ou nao
        }
    }

}
