package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeituraArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int t;
        System.out.println("Informe o tamanho: ");
        t = input.nextInt();
        System.out.println("Informe " + t + " numeros: ");
        // Lendo o array
        for (int i = 0; i < t; i++ )
        {
            numeros.add(input.nextInt());
        }

        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(i + 1 + "°: " + numeros.get(i));
        }


    }
}
