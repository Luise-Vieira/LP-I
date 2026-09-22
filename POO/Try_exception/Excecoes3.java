import java.io.BufferedReader; //caso faça java.io.* vai puxar todas as funcoes da bibloteca 
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excecoes3 {
    public static void main(String[] args) {
        try { // tente isso
            int x;
            x = Integer.parseInt("1");
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Erro de conversao numerica. ");
        } catch (FileNotFoundException e)
        {
            System.out.println("Arquivo nao encontrado. ");
        }
        catch(Exception e) //tratando todo tipo de excecao, deve ser sempre o ultimo e mais generico
        {
            System.out.println("Ocorreu um erro nao previsto " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Esse bloco sempre vai ser executado. "); // sempre é executado ocorrendo erro ou nao
        }
    }
}
