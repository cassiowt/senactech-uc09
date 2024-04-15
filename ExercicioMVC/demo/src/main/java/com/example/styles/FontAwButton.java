package com.example.styles;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

public class FontAwButton extends JButton {
        public FontAwButton(String text) {
            super(text);
            initUI();
            Font fontAwesome = loadFont("FonAwesomeBrands.otf", 24f); // Ajuste o caminho para o arquivo de fonte
        }
    
        private void initUI() {
            // Carrega a fonte FontAwesome
       

        // Cria um botão com um ícone da FontAwesome
        JButton button = new JButton("\uf3a6"); // Exemplo: ícone de relâmpago
            this.setForeground(Color.WHITE);
            this.setBackground(new Color(0, 123, 255)); // Bootstrap primary color
            this.setOpaque(true);
            this.setBorderPainted(false);
            this.setFocusPainted(false);
    
            // Definindo uma borda arredondada
            int radius = 25; // Define o raio dos cantos arredondados
            Border roundedBorder = BorderFactory.createLineBorder(new Color(0, 123, 255), 2, true);
            this.setBorder(roundedBorder);
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
    }
    
