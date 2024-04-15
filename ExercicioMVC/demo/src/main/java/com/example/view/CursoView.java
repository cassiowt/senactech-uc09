package com.example.view;

import com.example.controller.CursoController;
import com.example.model.Pessoa;
import com.example.styles.FontAwesome;
import com.example.styles.StyledButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class CursoView extends JFrame {
    private JTextField nomeCursoField;
    private JTextField nomeResponsavelField;
    private JComboBox<String> slideComboBox;
    private JTextField nomeApostilaField;

    private JButton cadastrarButton;
    private CursoController controller;

    public CursoView(CursoController controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cadastro de Curso");

        // Configura o painel com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel.setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Componentes ocupam o restante da linha
        gbc.fill = GridBagConstraints.HORIZONTAL; // Componentes expandem horizontalmente
        gbc.insets = new Insets(5, 0, 5, 0); // Padding entre componentes

        nomeCursoField = new JTextField(20);
        nomeResponsavelField = new JTextField(20);

        // Dados estáticos para o JComboBox
        String[] slidesDisponiveis = { "Introdução", "Desenvolvimento", "Conclusão" };
        JComboBox<String> slideComboBox = new JComboBox<>(slidesDisponiveis);

        // Botão "+" para adicionar slides
        JButton addSlideButton = new StyledButton("+");
        addSlideButton.setPreferredSize(new Dimension(40, 30)); 
        addSlideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddSlideWindow();
            }
        });

        nomeApostilaField = new JTextField(20);

        
        JButton cadastrarButton = new StyledButton("Cadastrar Curso");
        cadastrarButton.setPreferredSize(new Dimension(200, 50)); // Aumenta a altura do botão
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCurso();
            }
        });

        panel.add(new JLabel("Nome do Curso:"), gbc);
        panel.add(nomeCursoField, gbc);
        panel.add(new JLabel("Nome do Responsável:"), gbc);
        panel.add(nomeResponsavelField, gbc);

        //panel.add(new JLabel("Slides:"), gbc);
        JPanel slidePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        slidePanel.add(new JLabel("Slides:"));
        slidePanel.add(addSlideButton);
        panel.add(slidePanel, gbc);
        panel.add(slideComboBox, gbc);

        panel.add(new JLabel("Apostilas:"), gbc);
        panel.add(nomeApostilaField, gbc);

        gbc.fill = GridBagConstraints.CENTER; // Centraliza o botão
        panel.add(cadastrarButton, gbc);

        getContentPane().add(panel);
        pack();
    }

    protected void cadastrarCurso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarCurso'");
    }

    private void openAddSlideWindow() {
        // Criando uma nova janela para adicionar slides
        JFrame addSlideFrame = new JFrame("Adicionar Slide");
        addSlideFrame.setSize(300, 200);
        addSlideFrame.setLayout(new FlowLayout());
        addSlideFrame.add(new JLabel("Insira os detalhes do slide aqui."));
        // Você pode adicionar mais componentes aqui conforme necessário
    
        addSlideFrame.setLocationRelativeTo(null); // Centraliza a janela
        addSlideFrame.setVisible(true);
    }
}
