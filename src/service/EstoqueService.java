package service;

import model.Produto;

/**
 * Classe de serviço que gerencia o estoque de produtos
 */
public class EstoqueService {

    private Produto[] produtos;

    public EstoqueService(int tamanho) {
        produtos = new Produto[tamanho];
    }

    public void adicionarProduto(int index, Produto produto) {
        produtos[index] = produto;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            if (p != null) total += p.valorEstoque();
        }
        return total;
    }

    public void mostrarProdutos() {
        for (Produto p : produtos) {
            if (p != null) p.mostrarDados();
        }
    }

    public int tamanho() {
        return produtos.length;
    }

}