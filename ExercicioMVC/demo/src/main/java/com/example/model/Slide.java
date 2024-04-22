package com.example.model;

public class Slide {

	private String nome;

	private Curso curso;

	private int numeroPaginas;

	public Slide() {
	}
	
	public Slide(String nomeCurso) {
        this.curso = new Curso(nomeCurso); // Aqui, usamos o nome do curso para inicializar o nome do slide por simplificação
    }
	public Slide(String nome, String string, int numeroPaginas) {
		this.nome = nome;
		this.curso = string;
		this.numeroPaginas = numeroPaginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Slide [nome=" + nome + ", curso=" + curso + ", numeroPaginas=" + numeroPaginas + "]";
	}


}
