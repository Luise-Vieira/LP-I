import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excecoes5 {

    // Esse metodo tem uma grande chance de disperar aum exceção, quero delegar o
    // tratamento desta exceção para quem for usar este metodo.
    // Quem for usar o metodo deve OBRIGATORIAMENTE tratar o erro!
    public static void lerArquivo() throws IOException // Obriga qm for usar trata a questao (usar o try/catch)
    {
        BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
