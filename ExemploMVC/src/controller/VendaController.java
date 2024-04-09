package controller;

import View.View;
import model.Cliente;
import model.Produto;
import model.Venda;

public class VendaController {
    private Produto produto;
    private Cliente cliente;
    private Venda venda;
    private View view;

    public VendaController(Produto model, View view) {
        this.produto = new Produto("Produto 1", 10.0);
        this.cliente = new Cliente("Cliente 1", "123.456.789-00");  
        this.view = view;
    }

    // Método para realizar uma venda
    public boolean realizarVenda(Produto produto, Cliente cliente, int quantidade) {
        // Verifica se o valor do produto é maior que zero
        if (produto.getPreco() <= 0) {
            view.showError("O valor do produto não pode ser zero.");
            return false;
        }

        // Verifica se a quantidade não excede o máximo permitido
        if (quantidade > 1000) {
            view.showError("A quantidade máxima por venda é de 1000 unidades.");
            return false;
        }

        // Se a venda é bem-sucedida, atualiza a visão
        view.showSuccess("Venda realizada com sucesso!");
        return true;
    }

    // Métodos adicionais para interagir com o modelo e a visão podem ser adicionados aqui
    // ...
}