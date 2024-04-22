package com.example.view;

import com.example.controller.CursoController;
import com.example.model.Slide;
import com.example.model.Curso; // Importe a classe Curso do modelo.
import com.example.components.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;\
import java.util.List;

public class CursoView extends JPanel {
    private JTextField nomeCursoField;
    private JTextField nomeResponsavelField;
    private JComboBox<String> slideComboBox;
    private JTextField nomeApostilaField;
 
    private List<Slide> slideListModel;
    private JList<Slide> slideList;

    private JButton cadastrarButton;
    private CursoController controller;

    public CursoView(CursoController controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 0);

        slideListModel.add(new Slide("Introdução", "Curso 1", 10));
        slideList = new JList<Slide>();
        slideList.setModel((ListModel<Slide>) slideListModel);

        // String[] slidesDisponiveis = { "Introdução", "Desenvolvimento", "Conclusão" };
        // slideComboBox = new JComboBox<>(slidesDisponiveis);

        RoundedButton addSlideButton = new RoundedButton("+");
        addSlideButton.addActionListener(e -> openAddSlideWindow());

        nomeApostilaField = new JTextField(20);

        RoundedButton cadastrarButton = new RoundedButton("Cadastrar Curso");
        cadastrarButton.setPreferredSize(new Dimension(200, 50));
        cadastrarButton.addActionListener(e -> cadastrarCurso());

        add(new JLabel("Nome do Curso:"), gbc);
        add(nomeCursoField, gbc);
        add(new JLabel("Nome do Responsável:"), gbc);
        add(nomeResponsavelField, gbc);

        JPanel slidePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        slidePanel.add(new JLabel("Slides:"));
        slidePanel.add(addSlideButton);
        add(slidePanel, gbc);
        add(slideList, gbc);

        add(new JLabel("Apostilas:"), gbc);
        add(nomeApostilaField, gbc);

        gbc.fill = GridBagConstraints.CENTER;
        add(cadastrarButton, gbc);
    }

    protected void cadastrarCurso() {
        String nomeCurso = nomeCursoField.getText();
        String nomeResponsavel = nomeResponsavelField.getText();
        String slide = (String) slideComboBox.getSelectedItem();
        String apostila = nomeApostilaField.getText();

        Curso novoCurso = new Curso(nomeCurso, nomeResponsavel, apostila);
       // novoCurso.setSlideAtual(slide); // Método fictício, supõe-se que a classe Curso tenha um método para configurar o slide atual.
       // controller.cadastrarCurso(novoCurso);

        JOptionPane.showMessageDialog(this, "Curso cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void openAddSlideWindow() {
        String nomeCurso = nomeCursoField.getText(); // Supõe que este campo contém o nome do curso
        Slide slide = new Slide(nomeCurso);
        SlideView slideView = new SlideView(slide);
        JFrame frame = new JFrame("Adicionar Slide");
        frame.setContentPane(slideView);
        frame.pack();
        frame.setVisible(true);
    }
}
