package Arrays;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um array list de inteiros
        ArrayList<Integer> A = new ArrayList<>();// quando vai criar um arraylist tem q definir o tipo especifico
        // o integer é uma classe que simula um inteiro, pois o jeito que criaram pedi
        // para receber uma classe
        A.add(10);
        A.add(20);
        A.add(30);
        for(int i=0;i<A.size();i++)
        {
            System.out.println(A.get(i));
        }
    }
}
