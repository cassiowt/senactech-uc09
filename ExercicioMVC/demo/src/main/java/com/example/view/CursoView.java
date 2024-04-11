package com.example.view;

import com.example.controller.CursoController;
import com.example.model.Pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CursoView extends JFrame {
    private JTextField nomeCursoField;
    private JTextField nomeResponsavelField;
    //TODO #1 -  incluir campos para Slides e Apostilas na GUI

    private JButton cadastrarButton;
    private CursoController controller;

    public CursoView(CursoController controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        nomeCursoField = new JTextField(20);
        nomeResponsavelField = new JTextField(20);

        cadastrarButton = new JButton("Cadastrar Curso");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCurso();
            }
        });

        setLayout(new FlowLayout());
        add(new JLabel("Nome do Curso:"));
        add(nomeCursoField);
        add(new JLabel("Nome do Responsável:"));
        add(nomeResponsavelField);
        add(cadastrarButton);

        pack();
        setTitle("Cadastro de Curso");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void cadastrarCurso() {
        //TODO #2 - Criar Slides e Apostilas
        String nomeCurso = nomeCursoField.getText();
        String nomeResponsavel = nomeResponsavelField.getText();

        controller.criarCurso(nomeCurso, new Pessoa(nomeResponsavel), null, null);

        JOptionPane.showMessageDialog(this, "Curso cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CursoController controller = new CursoController();
                CursoView view = new CursoView(controller);
                view.setVisible(true);
            }
        });
    }
}
