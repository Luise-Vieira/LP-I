import java.io.FileReader;
import java.io.IOException;


class ExemploChecked {
    public static void lerArquivo (String nomeArquivo) throws IOException //qm for usar que vai ter que resolver
    {
        FileReader file = new FileReader(nomeArquivo);
        file.close();
        System.out.println("Arquivo acessado com sucesso");
   
}
    public static void main(String[] args) {
        try{
            lerArquivo("dados.txt");
        }catch(IOException e)
        {
        System.out.println(e.getMessage());}
    }
}

