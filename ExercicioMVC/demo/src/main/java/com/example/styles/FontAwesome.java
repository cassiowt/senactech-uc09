package com.example.styles;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

public class FontAwesome extends JButton {

    public FontAwesome(String text) {
        initUI(text);
        Font fontAwesome = loadFont("FonAwesomeBrands.otf", 24f); // Ajuste o caminho para o arquivo de fonte
    }

    private void initUI(String text) {
        //JButton button = new JButton(text); // Exemplo: ícone de relâmpago
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(0, 123, 255)); // Bootstrap primary color
        this.setOpaque(true);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
    }

    private Font loadFont(String path, float size) {
        try {
            InputStream is = getClass().getResourceAsStream(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(size);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JLabel().getFont();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FontAwesome().setVisible(true);
            }
        });
    }
}
