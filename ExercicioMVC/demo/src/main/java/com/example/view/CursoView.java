package com.example.view;

import com.example.controller.CursoController;
import com.example.model.Slide;
import com.example.components.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class CursoView extends JPanel {
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
        // Configura este painel com GridBagLayout
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Componentes ocupam o restante da linha
        gbc.fill = GridBagConstraints.HORIZONTAL;     // Componentes expandem horizontalmente
        gbc.insets = new Insets(5, 0, 5, 0);         // Padding entre componentes

        nomeCursoField = new JTextField(20);
        nomeResponsavelField = new JTextField(20);

        // Dados estáticos para o JComboBox
        String[] slidesDisponiveis = { "Introdução", "Desenvolvimento", "Conclusão" };
        slideComboBox = new JComboBox<>(slidesDisponiveis);

        // Botão "+" para adicionar slides
        RoundedButton addSlideButton = new RoundedButton("+");
        addSlideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddSlideWindow();
            }
        });

        nomeApostilaField = new JTextField(20);

        RoundedButton cadastrarButton = new RoundedButton("Cadastrar Curso");
        cadastrarButton.setPreferredSize(new Dimension(200, 50)); // Aumenta a altura do botão
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCurso();
            }
        });

        add(new JLabel("Nome do Curso:"), gbc);
        add(nomeCursoField, gbc);
        add(new JLabel("Nome do Responsável:"), gbc);
        add(nomeResponsavelField, gbc);

        JPanel slidePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        slidePanel.add(new JLabel("Slides:"));
        slidePanel.add(addSlideButton);
        add(slidePanel, gbc);
        add(slideComboBox, gbc);

        add(new JLabel("Apostilas:"), gbc);
        add(nomeApostilaField, gbc);

        gbc.fill = GridBagConstraints.CENTER; // Centraliza o botão
        add(cadastrarButton, gbc);
    }

    protected void cadastrarCurso() {
        // Implementação da lógica de cadastro do curso
        System.out.println("Cadastrar Curso");
    }

    private void openAddSlideWindow() {
        // Criando uma nova janela para adicionar slides
        Slide slide = new Slide();
        SlideView slideView = new SlideView(slide);
    }
}
