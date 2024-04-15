package com.example.styles;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class StyledButton extends JButton {
   
    public StyledButton(String text) {
        super(text);
        initUI();
    }

    private void initUI() {
        this.setFont(new Font("Arial", Font.BOLD, 14));
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
}
