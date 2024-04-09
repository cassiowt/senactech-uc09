package view;

import javax.swing.*;
import javax.swing.text.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.VendaController;
import model.Cliente;
import model.Produto;
import model.Venda;
import view.VendaView;

public class VendaGUI extends JFrame {
    private JTextField nomeProdutoTextField;
    private JTextField valorProdutoTextField;
    private JTextField nomeClienteTextField;
    private JTextField cpfClienteTextField;
    private JButton venderButton;
    private VendaController vendaController;

    // Instância de VendaController
        


    public VendaGUI() {
        Venda venda = new Venda(); // Modelo de Venda pré-definido
       // Produto produto = new Produto(); // Modelo de Produto pré-definido
        VendaView view = new VendaView();
       // Cliente cliente = new Cliente();// Modelo de Cliente pré-definido
        this.vendaController = new VendaController(venda, view);
        // Configuração da janela
       
        setTitle("Sistema de Vendas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Criação dos campos de texto
        nomeProdutoTextField = new JTextField();
        valorProdutoTextField = new JTextField();
        nomeClienteTextField = new JTextField();
        cpfClienteTextField = new JTextField();

        // Criação do botão
        venderButton = new JButton("VENDER");
        venderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarVenda();
            }
        });

        // Adiciona os componentes ao JFrame
        add(new JLabel("Nome do Produto:"));
        add(nomeProdutoTextField);
        add(new JLabel("Valor do Produto:"));
        add(valorProdutoTextField);
        add(new JLabel("Nome do Cliente:"));
        add(nomeClienteTextField);
        add(new JLabel("CPF do Cliente:"));
        add(cpfClienteTextField);
        add(venderButton);

        // Mostra a janela
        pack();
        setVisible(true);
    }

    private void realizarVenda() {
        // Obter os valores dos campos de texto
        String nomeProduto = nomeProdutoTextField.getText();
        double valorProduto = Double.parseDouble(valorProdutoTextField.getText());
        String nomeCliente = nomeClienteTextField.getText();
        String cpfCliente = cpfClienteTextField.getText();

        // Criar instâncias de Produto e Cliente com os valores obtidos
        Produto produto = new Produto(nomeProduto, valorProduto);
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        // Tenta realizar a venda usando o controller
        if (vendaController.realizarVenda(produto.getNome() , produto.getPreco(),cliente.getNome(), 1)) { // Assumindo a quantidade como 1 para simplificar
            // Atualizar a GUI conforme necessário
        }
    }


    public static void main(String[] args) {
        // Deve ser executado dentro do Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VendaGUI();
            }
        });
    }
}

