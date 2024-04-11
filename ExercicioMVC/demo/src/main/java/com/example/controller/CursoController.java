package example.controller;

import example.model.Curso;
import example.model.Pessoa;
import example.model.Slide;
import example.model.Apostila;
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
