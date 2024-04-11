package com.example.model;

import java.util.Date;

public class MaterialDidatico {

	private Date dataEntrega;

	private Date dataRevisao;

	private boolean estaCompleto;

	private Curso curso;

	public MaterialDidatico() {
	}

	public MaterialDidatico(Date dataEntrega, Date dataRevisao, boolean estaCompleto, Curso curso) {
		this.dataEntrega = dataEntrega;
		this.dataRevisao = dataRevisao;
		this.estaCompleto = estaCompleto;
		this.curso = curso;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Date getDataRevisao() {
		return dataRevisao;
	}

	public void setDataRevisao(Date dataRevisao) {
		this.dataRevisao = dataRevisao;
	}

	public boolean isEstaCompleto() {
		return estaCompleto;
	}

	public void setEstaCompleto(boolean estaCompleto) {
		this.estaCompleto = estaCompleto;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "MaterialDidatico [dataEntrega=" + dataEntrega + ", dataRevisao=" + dataRevisao + ", estaCompleto="
				+ estaCompleto + ", curso=" + curso + "]";
	}

}
