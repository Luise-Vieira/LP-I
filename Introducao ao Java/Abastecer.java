import java.util.Scanner;

public class Abastecer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gasolina, etanol;
        System.out.println("Digite o valor da gasolina: ");
        gasolina = input.nextFloat();
        System.out.println("Digite o preco do etanol:");
        etanol = input.nextFloat();

        if (gasolina * 0.7 < etanol) {
            System.out.println("A melhor opcao é colocar gasolina");
        } else if (gasolina * 0.7 == etanol) {
            System.out.println("Tanto faz");
        } else {
            System.out.println("A melhor opcao é colocar etanol");
        }
        input.close();
    }
}
