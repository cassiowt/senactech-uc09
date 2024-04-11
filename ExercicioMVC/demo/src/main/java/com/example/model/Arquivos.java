package example.model;

public class Arquivos {

	private String nome;

	private String descricao;

	private String localModelo;

	private Setup setup;

	private Repositorio repositorio;

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

	public String getLocalModelo() {
		return localModelo;
	}

	public void setLocalModelo(String localModelo) {
		this.localModelo = localModelo;
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

	public Repositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(Repositorio repositorio) {
		this.repositorio = repositorio;
	}
	
}
