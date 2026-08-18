import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um numero: ");
        //receber pelo taclado
        Scanner input = new Scanner(System.in);

        num = input.nextInt(); //lendo e armazenando

        if (num % 2 != 0) 
        {
            System.out.println("O numero " + num +   " é impar");
        }
        else 
        {
            System.out.println("O numero " + num +  " é par");
        }
        input.close();

    }
}
