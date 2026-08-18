import java.util.Scanner;

public class Soma {
    
    //função principal
    public static void main(String[] args) {
        int num1,num2,soma;
        System.out.println("Digite um numero: ");

        //Criar um objeto para controlar entrada 
        Scanner input = new Scanner(System.in); // scanf 
        //começa criando uma variavel e recebe um novo scanner q serve pra receber dados pelo teclado

        num1 = input.nextInt(); //Lendo um inteiro do teclado e armazenando em num1

        System.out.println("Digite outro numero: ");
        num2 = input.nextInt();
        soma= num1+num2;

        System.out.println("A soma é " + soma); //O + serve para juntar a string e um inteiro ( so junto visualmente)  
        input.close(); 
    } 
}
