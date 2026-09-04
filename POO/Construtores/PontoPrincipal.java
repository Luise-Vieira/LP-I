package Construtores;



public class PontoPrincipal {
    public static void main(String[] args) {
        //Ponto p1 = new Ponto(); //Criando construtor sem parametro
        //Ponto p2 = new Ponto(10,20);//Criando construtor passando parametro
        
        //Criar dois pontos com valores diferentes
        //Somar os pontos e mostrar o resultado
        //Jogar no terceiro objeto e mostrar os pontos do terceiro objeto.

        Ponto p1 = new Ponto(10,20);//Ja tenho um construtor q me permite passar os dois parametros
        Ponto p2 = new Ponto(10,10);
        Ponto p3 = new  Ponto();//Criando vazio pq queremos atribuir o resultado anterior e jogar no p3 
        p3.setX(p1.getX()+p2.getX());//Jogo a soma dos valores do x de p1 e p2
        p3.setY(p1.getY()+p2.getY());
        System.out.println("Resultado: x:" + p3.getX() + " y: " + p3.getY()); //Imprimindo os valores de p3

        //outro teste

        Ponto p4 = new Ponto(10,20);
        Ponto p5 = new Ponto(20,30);

        p4=p5; // Passou a aponta para onde p5 aponta, estao apontando para o msm objeto, o objeto que p4 apontava se perde mas o java apaga dps com o coletor de lixo

        p4.setX(50);
        p5.setY(60);

        System.out.println(p4.getX() + " " + p4.getY());
        System.out.println(p5.getX() + " " + p5.getY());

        Ponto p6 = new Ponto (10,20);
        Ponto p7 = new Ponto(p1); //ele cria um espaço proprio dele sem substituir, cria uma copia do objeto, caso altere os valores ou de p1 ou de p2 sao objetos diferentes

        p6.setX(100);
        p7.setX(200);

        System.out.println(p6.getX()); //teste para mostrar que vao mostrar valores diferentes, esse 100
        System.out.println(p7.getX()); // esse 200

        
    }   
    
}
