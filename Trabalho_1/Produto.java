package Trabalho_1;

public class Produto {

    private String nome;
    private Double preco;

    // definir o nome de um produto setNome;
    public void setNome(String nome) {
        this.nome = nome;
    };

    // definir o preço de um produto setPreco;
    public void setPreco(double preco) {
        this.preco = preco;
    };

    // consultar o nome (getNome) e o preço (getPreco) já armazenados.
    public String getNome() {
        return this.nome; 
    };

    public double getPreco() {
        return this.preco;
    };

};
