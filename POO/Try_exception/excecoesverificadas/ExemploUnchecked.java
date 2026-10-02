

public class ExemploUnchecked {
    public static  int dividir(int a,int b) throws IllegalAccessException 
    {
        if (b==0)
        {
            throw new IllegalAccessException("O segundo parametro nao pode ser zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=0;
    try{
        System.out.println(dividir(a, b));
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }

    }
}
//runtimeexception n precisa ser tratada com try/catch.
// o restante precisa.
