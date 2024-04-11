package com.example.controller;

import com.example.model.Curso;
import com.example.model.Pessoa;
import com.example.model.Slide;
import com.example.model.Apostila;
import java.util.List;

public class CursoController {
    private Curso curso;

    public void criarCurso(String nome, Pessoa responsavel, List<Slide> slides, List<Apostila> apostilas) {
       if (valida(nome, responsavel, slides, apostilas)) {
            slides = List.of(new Slide("Slide 1"), new Slide("Slide 2"), new Slide("Slide 3"));
        }
        curso = new Curso(nome, responsavel, slides, apostilas);
        // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    private boolean valida(String nome, Pessoa responsavel, List<Slide> slides, List<Apostila> apostilas) {
        return slides == null || slides.isEmpty() || apostilas == null || apostilas.isEmpty() || responsavel == null || nome == null;
    }

    public Curso getCurso() {
        return curso;
    }
}
