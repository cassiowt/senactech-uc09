package com.example;

import javax.swing.SwingUtilities;

import com.example.controller.CursoController;
import com.example.view.CursoView;

public class Main {
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