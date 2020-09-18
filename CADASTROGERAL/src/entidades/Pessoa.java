package entidades;

public class Pessoa {

	private String nome;
	private String telefone;
	private String endereco;
	
	
	public Pessoa(String nome) {
	
		this.nome = nome;
	}


	public Pessoa(String nome, String telefone) {
	
		this.nome = nome;
		this.telefone = telefone;
	}


	public Pessoa(String nome, String telefone, String endereco) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}


