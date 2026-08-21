import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        int cont = 0;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " n é primo, possui " + cont + " divisores");
        }
        input.close();

    }
}