package Arrays;

import java.util.Scanner;

public class LeituraArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros; // Criei uma ref para um array
        int t;
        System.out.println("Informe o tamanho: ");
        t = input.nextInt();
        numeros = new int[t]; // Criando um array
        
        System.out.println("Informe " + t + " numeros: ");
        // Lendo o array
        for (int i = 0; i < numeros.length; i++) // numeros.length -> tamanho do array
        {
            numeros[i] = input.nextInt();
        }
        System.out.println("\n");
        // Mostrando o array ao contrario
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(i + 1 + "°: " + numeros[i]);
        }
    }
}
