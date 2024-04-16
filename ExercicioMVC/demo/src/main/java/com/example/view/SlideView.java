package com.example.view;
import com.example.model.Slide;

import javax.swing.*;
import java.awt.*;

public class SlideView extends JPanel {
    
    private Slide slide;
    private JLabel nomeLabel;
    private JLabel cursoLabel;
    private JLabel numeroPaginasLabel;

    public SlideView(Slide slide) {
        this.slide = slide;
        initUI();
    }

    private void initUI() {

        setLayout(new BorderLayout());
        
        nomeLabel = new JLabel("Nome: " );
        cursoLabel = new JLabel("Curso: "); // Supondo que Curso tem um método getNomeCurso()
        numeroPaginasLabel = new JLabel("Número de Páginas: " );
        
        add(nomeLabel, BorderLayout.NORTH);
        add(cursoLabel, BorderLayout.CENTER);
        add(numeroPaginasLabel, BorderLayout.SOUTH);
    }
}
