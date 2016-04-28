package Exercicio2504.Fornecedor;


public class Fornecedor {
	private int codigo;
	private String nome;
	private String cpf;
	private String endereco;
	public Fornecedor(int codigo, String nome, String cpf, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Fornecedor [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
}
