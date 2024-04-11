package example.model;

import java.util.Arrays;

public class PerfilAcesso {

	private String nome;

	private String descricao;

	private String permissoes;

	private Usuario[] usuarios;

	public PerfilAcesso() {
	}

	public PerfilAcesso(String nome, String descricao, String permissoes, Usuario[] usuarios) {
		this.nome = nome;
		this.descricao = descricao;
		this.permissoes = permissoes;
		this.usuarios = usuarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "PerfilAcesso [nome=" + nome + ", descricao=" + descricao + ", permissoes=" + permissoes + ", usuarios="
				+ Arrays.toString(usuarios) + "]";
	}



}
