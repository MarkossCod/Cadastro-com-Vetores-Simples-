public class Produtos {

    private String nome;
    private double preco;

public Produtos(String nome,double preco){
    this.nome=nome;
    this.preco=0.0;
}

    // Métodos getters e setters de nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters de preço
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirInformacoes(){
    System.out.println("Nome do produto: "+nome);
    System.out.println("Preço do produto: "+preco);

    }
}
