package Trabalho_1;

import java.util.Scanner;

public class PrincipalProduto {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String Pnome = input.next();
        System.out.println("Digite o preco do produto: ");
        double Ppreco = input.nextDouble();
        Produto P = new Produto();
        P.setNome(Pnome);
        P.setPreco(Ppreco);
        String nome= P.getNome();
        Double preco = P.getPreco();
        System.out.println("Nome: " + nome + " Preco: " + preco);
        input.close();
    }
    
}
