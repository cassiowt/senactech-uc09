package controller;

import model.Cliente;
import model.Produto;
import model.Venda;
import view.VendaView;  // Esta classe precisa ser criada no pacote 'view'.

public class VendaController {
    private Venda venda;
    private VendaView view;

    public VendaController(Venda venda, VendaView view) {
        this.venda = venda;
        this.view = view;
    }

    public boolean realizarVenda(String nomeProduto, double valorProduto, String nomeCliente, int quantidade) {
        // Verifica se o valor do produto é válido
        if (valorProduto <= 0) {
            view.showError("O valor do produto não pode ser zero.");
            return false;
        }

        // Verifica se a quantidade não excede o máximo permitido
        if (quantidade <= 0 || quantidade > 1000) {
            view.showError("A quantidade deve ser maior que zero e não pode exceder 1000 unidades.");
            return false;
        }

        // Se passar pelas validações, cria as instâncias de Produto e Cliente
        Produto produto = new Produto(nomeProduto, valorProduto);
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        
        // Configura o modelo de Venda e supõe que a venda é sempre bem-sucedida
        venda.setProduto(produto);
        venda.setCliente(cliente);
        venda.setQuantidade(quantidade);

        // Simula a lógica de venda como sempre bem-sucedida para este exemplo
        view.showSuccess("Venda realizada com sucesso! Produto: " + produto + ", Cliente: " + cliente + ", Quantidade: " + quantidade );

        // Aqui você pode incluir lógica adicional, como atualizar um banco de dados ou arquivo
        return true;
    }

    // Métodos adicionais para interagir com o modelo e a visão podem ser adicionados aqui
}