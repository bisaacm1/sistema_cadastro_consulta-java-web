/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isaac.sistema.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
@Entity
@Table(name = "funcionario")

@NamedQueries({ @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
		@NamedQuery(name = "Funcionario.findByIdFuncionario", query = "SELECT f FROM Funcionario f WHERE f.idFuncionario = :idFuncionario"),
		@NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf"),
		@NamedQuery(name = "Funcionario.findByRg", query = "SELECT f FROM Funcionario f WHERE f.rg = :rg"),
		@NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
		@NamedQuery(name = "Funcionario.findByDataNascimento", query = "SELECT f FROM Funcionario f WHERE f.dataNascimento = :dataNascimento"),
		@NamedQuery(name = "Funcionario.findByEndereco", query = "SELECT f FROM Funcionario f WHERE f.endereco = :endereco"),
		@NamedQuery(name = "Funcionario.findByNumero", query = "SELECT f FROM Funcionario f WHERE f.numero = :numero"),
		@NamedQuery(name = "Funcionario.findByComplemento", query = "SELECT f FROM Funcionario f WHERE f.complemento = :complemento"),
		@NamedQuery(name = "Funcionario.findByBairro", query = "SELECT f FROM Funcionario f WHERE f.bairro = :bairro"),
		@NamedQuery(name = "Funcionario.findByCidade", query = "SELECT f FROM Funcionario f WHERE f.cidade = :cidade"),
		@NamedQuery(name = "Funcionario.findByEstado", query = "SELECT f FROM Funcionario f WHERE f.estado = :estado"),
		@NamedQuery(name = "Funcionario.findByCep", query = "SELECT f FROM Funcionario f WHERE f.cep = :cep"),
		@NamedQuery(name = "Funcionario.findByTelefone", query = "SELECT f FROM Funcionario f WHERE f.telefone = :telefone"),
		@NamedQuery(name = "Funcionario.findByCelular", query = "SELECT f FROM Funcionario f WHERE f.celular = :celular"),
		@NamedQuery(name = "Funcionario.findByEmail", query = "SELECT f FROM Funcionario f WHERE f.email = :email") })
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_funcionario")
	private Integer idFuncionario;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "rg")
	private String rg;
	@Column(name = "nome")
	private String nome;
	@Column(name = "data_nascimento")
	private String dataNascimento;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "numero")
	private Integer numero;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "cidade")
	private String cidade;
	@Column(name = "estado")
	private String estado;
	@Column(name = "cep")
	private String cep;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "celular")
	private String celular;
	@Column(name = "email")
	private String email;

	public Funcionario() {
	}

	public Funcionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Funcionario)) {
			return false;
		}
		Funcionario other = (Funcionario) object;
		if ((this.idFuncionario == null && other.idFuncionario != null)
				|| (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "criacaobanco.Funcionario[ idFuncionario=" + idFuncionario + " ]";
	}

}
