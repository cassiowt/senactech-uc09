package com.example.view;

import com.example.model.Slide;
import com.example.components.RoundedButton;
import com.example.model.Curso;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;


public class SlideView extends JPanel {
    private Slide slide;
    private JTextField nomeTextField;
    private JComboBox<Curso> cursoComboBox;
    private JTextField numeroPaginasTextField;
    private RoundedButton saveButton;  // Botão para salvar as alterações\\

    public SlideView(Slide slide) {
        this.slide = slide;
        initUI();
    }

    private void initUI() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Componentes ocupam o restante da linha
        gbc.fill = GridBagConstraints.HORIZONTAL;     // Componentes expandem horizontalmente
        gbc.insets = new Insets(5, 0, 5, 0);         // Padding entre componentes

        nomeTextField = new JTextField(20);
 
        nomeTextField.setText(slide.getNome());
        cursoComboBox = new JComboBox<>();  // Assumindo que você tem uma lista de cursos disponível
        cursoComboBox.setSelectedItem(slide.getCurso());
        loadCursos(cursoComboBox);
        numeroPaginasTextField = new JTextField(20);
        numeroPaginasTextField.setText(Integer.toString(slide.getNumeroPaginas()));

        saveButton = new RoundedButton("Salvar Alterações");
        saveButton.addActionListener(this::saveSlide);

        add(new JLabel("Nome do Slide:"), gbc);
        add(nomeTextField, gbc);
        add(new JLabel("Curso:"), gbc);
        add(cursoComboBox, gbc);
        add(new JLabel("Número de Páginas:"), gbc);
        add(numeroPaginasTextField, gbc);
        gbc.fill = GridBagConstraints.CENTER;
        add(saveButton, gbc);
    }

    private void loadCursos(JComboBox<Curso> comboBox) {
        // Supondo que você tenha uma lista ou método para recuperar cursos
        // Por exemplo:
        comboBox.addItem(new Curso(slide.getCurso().getNome()));
        comboBox.addItem(new Curso("Matemática"));
        comboBox.addItem(new Curso("Ciência"));
        // Defina aqui a seleção correta
        comboBox.setSelectedItem(slide.getCurso());
    }

    private void saveSlide(ActionEvent e) {
        // Implementação do método para salvar as mudanças no slide
        slide.setNome(nomeTextField.getText());
        slide.setCurso((Curso) cursoComboBox.getSelectedItem());
        slide.setNumeroPaginas(Integer.parseInt(numeroPaginasTextField.getText()));
        JOptionPane.showMessageDialog(this, "Slide salvo com sucesso!");
    }
}
