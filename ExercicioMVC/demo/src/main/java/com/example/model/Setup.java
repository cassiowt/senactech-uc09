package example.model;

public class Setup {

	private String nome;

	private String quantidadeArquivos;

	private String descricao;

	private Arquivos arquivos;

	public Setup() {
	}

	public Setup(String nome, String quantidadeArquivos, String descricao, Arquivos arquivos) {
		this.nome = nome;
		this.quantidadeArquivos = quantidadeArquivos;
		this.descricao = descricao;
		this.arquivos = arquivos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidadeArquivos() {
		return quantidadeArquivos;
	}

	public void setQuantidadeArquivos(String quantidadeArquivos) {
		this.quantidadeArquivos = quantidadeArquivos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Arquivos getArquivos() {
		return arquivos;
	}

	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}

    @Override
    public String toString() {
        return "Setup [nome=" + nome + ", quantidadeArquivos=" + quantidadeArquivos + ", descricao=" + descricao
                + ", arquivos=" + arquivos + "]";
    }

}
