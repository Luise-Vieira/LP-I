public class Excecoes {
    

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        System.out.println("O programa continua executando");
    }
}
