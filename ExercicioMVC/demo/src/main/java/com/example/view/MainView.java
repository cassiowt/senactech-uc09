package com.example.view;

import javax.swing.*;

import com.example.model.Slide;

import java.awt.*;
import java.awt.event.*;

public class MainView extends JFrame {
    private JPanel sidePanel;
    private boolean isSidePanelVisible = false;
    private JPanel contentPanel; // Painel para conteúdo principal

    public MainView() {
        setTitle("Main Application View");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Botão que ativa o menu lateral
        JButton menuButton = new JButton("\u2630"); // Símbolo Unicode para "hamburguer"
        menuButton.addActionListener(e -> toggleSidePanel());

        // Configuração do painel lateral (menu)
        sidePanel = createSidePanel();
        
        // Configuração do painel de conteúdo principal
        contentPanel = new JPanel();
        contentPanel.setLayout(new CardLayout()); // Permite a troca de conteúdo
        contentPanel.add(new JLabel("Bem-vindo! Selecione uma opção do menu."), "home");
        add(contentPanel, BorderLayout.CENTER);

        // Adiciona o botão de menu ao frame
        add(menuButton, BorderLayout.NORTH);

        // Adiciona o painel lateral
        sidePanel.setPreferredSize(new Dimension(150, getHeight()));
        add(sidePanel, BorderLayout.WEST);
        sidePanel.setVisible(false);
    }

    private JPanel createSidePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panel.setBackground(Color.LIGHT_GRAY);

        addMenuItem(panel, "Material Didático", () -> showMaterialDidatico());
        addMenuItem(panel, "Cursos", () -> showCursos());
        addSubMenuItem(panel, "Apostilas", () -> showApostilas());
        addSubMenuItem(panel, "Slides", () -> showSlides());
        addMenuItem(panel, "Usuário", () -> showUsuario());
        addSubMenuItem(panel, "Perfil Acesso", () -> showPerfilAcesso());
        addMenuItem(panel, "Repositório", () -> showRepositorio());
        addSubMenuItem(panel, "Setup", () -> showSetup());
        addSubMenuItem(panel, "Arquivos", () -> showArquivos());

        return panel;
    }

    private void addMenuItem(JPanel panel, String name, Runnable action) {
        JButton button = new JButton(name);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addActionListener(e -> action.run());
        panel.add(button);
    }

    private void addSubMenuItem(JPanel panel, String name, Runnable action) {
        JButton button = new JButton("  " + name);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addActionListener(e -> action.run());
        panel.add(button);
    }

    private void toggleSidePanel() {
        isSidePanelVisible = !isSidePanelVisible;
        sidePanel.setVisible(isSidePanelVisible);
        validate();
    }

    private void setContentPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    
    // Métodos para mostrar diferentes conteúdos
    private void showMaterialDidatico() {
        setContent("Material Didático");
    }
    private void showCursos() {
        CursoView cursoView = new CursoView(null);
        setContentPanel(cursoView);
    }

    private void showApostilas() {
        setContent("Apostilas");
    }

    private void showSlides() {
        Slide slide = new Slide();
        SlideView slideView = new SlideView(slide);
        setContentPanel(slideView);
    }

    private void showUsuario() {
        setContent("Usuário");
    }

    private void showPerfilAcesso() {
        setContent("Perfil Acesso");
    }

    private void showRepositorio() {
        setContent("Repositório");
    }

    private void showSetup() {
        setContent("Setup");
    }

    private void showArquivos() { 
        setContent("Arquivos");
    }

    private void setContent(String content) {
        contentPanel.removeAll();
        contentPanel.add(new JLabel(content), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView().setVisible(true));
    }
}
