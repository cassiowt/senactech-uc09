package example.model;

public class Pessoa {

	private String nome;

	private String email;

	public Pessoa() {
	}

	private TipoPessoa tipoPessoa;

	public Pessoa(String nome, String email, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.email = email;
		this.tipoPessoa = tipoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + ", tipoPessoa=" + tipoPessoa + "]";
    }

}
