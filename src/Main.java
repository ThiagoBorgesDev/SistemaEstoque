import java.util.Scanner;
import model.Produto;
import service.EstoqueService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EstoqueService estoque = new EstoqueService(5);

        for (int i = 0; i < estoque.tamanho(); i++) {

            System.out.println("Digite o nome do Produto " + (i+1) + ":");
            String nome = sc.nextLine();

            System.out.println("Digite o preço do Produto " + (i+1) + ":");
            double preco = sc.nextDouble();

            System.out.println("Digite a quantidade do Produto " + (i+1) + ":");
            int quantidade = sc.nextInt();
            sc.nextLine(); // Consumir enter

            Produto produto = new Produto(nome, preco, quantidade);
            estoque.adicionarProduto(i, produto);

            System.out.println();
        }

        System.out.println("===== Produtos Cadastrados =====");
        estoque.mostrarProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotal());

        sc.close();
    }

}