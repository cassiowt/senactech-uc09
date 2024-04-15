package com.example;

import com.example.components.*;
import com.example.view.CursoView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Material - Exemplo de MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        RoundedButton openButton = new RoundedButton("Cadastro Curso");
        openButton.addActionListener(this::onOpenNewWindow);
        add(openButton);
    }

    private void onOpenNewWindow(ActionEvent e) {
        CursoView cursoView = new CursoView(null);
        cursoView.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
