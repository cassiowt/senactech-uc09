package com.example.model;

import java.util.Collection;
import java.util.List;

public class Curso {

	private String nome;

	private Pessoa responsavel;

	private Collection<Slide> slides;

	private List<Apostila> apostilas;

	public Curso() {
	}

	public Curso(String nome, Pessoa responsavel, Collection<Slide> slides, List<Apostila> apostilas) {
		this.nome = nome;
		this.responsavel = responsavel;
		this.slides = slides;
		this.apostilas = apostilas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}

	public Collection<Slide> getSlides() {
		return slides;
	}

	public void setSlides(Collection<Slide> slides) {
		this.slides = slides;
	}

	public List<Apostila> getApostilas() {
		return apostilas;
	}

	public void setApostilas(List<Apostila> apostilas) {
		this.apostilas = apostilas;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", responsavel=" + responsavel + ", slides=" + slides + ", apostilas="
				+ apostilas + "]";
	}

}
