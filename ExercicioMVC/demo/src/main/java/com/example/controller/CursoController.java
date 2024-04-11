package com.example.controller;

import com.example.model.Curso;
import com.example.model.Pessoa;
import com.example.model.Slide;
import com.example.model.Apostila;
import java.util.List;

public class CursoController {
    private Curso curso;

    public void criarCurso(String nome, Pessoa responsavel, List<Slide> slides, List<Apostila> apostilas) {
        curso = new Curso(nome, responsavel, slides, apostilas);
        // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public Curso getCurso() {
        return curso;
    }
}
