package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaGUI extends JFrame {
    private JTextField nomeProdutoTextField;
    private JTextField valorProdutoTextField;
    private JTextField nomeClienteTextField;
    private JTextField cpfClienteTextField;
    private JButton venderButton;

    public VendaGUI() {
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
        String nomeProduto = nomeProdutoTextField.getText();
        String valorProduto = valorProdutoTextField.getText();
        String nomeCliente = nomeClienteTextField.getText();
        String cpfCliente = cpfClienteTextField.getText();

        // Aqui você incluiria a lógica para processar a venda
        // Por exemplo, validar os dados e atualizar o banco de dados ou modelo
        
        JOptionPane.showMessageDialog(this, 
            "Venda Realizada!\n" +
            "Produto: " + nomeProduto + "\n" +
            "Valor: " + valorProduto + "\n" +
            "Cliente: " + nomeCliente + "\n" +
            "CPF: " + cpfCliente
        );
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

