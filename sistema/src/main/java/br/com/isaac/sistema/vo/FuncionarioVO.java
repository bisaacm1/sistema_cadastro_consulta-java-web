package br.com.isaac.sistema.vo;

public class FuncionarioVO {

	private int idFuncionario;
	private String nome;
	private String rg;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String celular;
	private String email;
	
	
	public FuncionarioVO() {
		
	}


	public FuncionarioVO(int idFuncionario, String nome, String rg, String cpf, String dataNascimento, String endereco,
			int numero, String complemento, String bairro, String cidade, String estado, String cep, String telefone,
			String celular, String email) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}


	public int getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
