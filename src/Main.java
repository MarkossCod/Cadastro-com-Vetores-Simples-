import java.util.Scanner;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(nome, preco);
        }

        // Mostrar produtos cadastrados
        System.out.println("\n--- Produtos Cadastrados ---");
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.nome + " | Preço: " + p.preco);
        }

        // Encontrar o produto mais caro
        Produto maisCaro = produtos[0];
        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].preco > maisCaro.preco) {
                maisCaro = produtos[i];
            }
        }

        // Exibir produto mais caro
        System.out.println("\nProduto mais caro: " + maisCaro.nome + " | Preço: " + maisCaro.preco);

        sc.close();
    }
}

