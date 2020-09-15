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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
		@NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
		@NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
		@NamedQuery(name = "Cliente.findByRg", query = "SELECT c FROM Cliente c WHERE c.rg = :rg"),
		@NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
		@NamedQuery(name = "Cliente.findByDataNascimento", query = "SELECT c FROM Cliente c WHERE c.dataNascimento = :dataNascimento"),
		@NamedQuery(name = "Cliente.findByEndereco", query = "SELECT c FROM Cliente c WHERE c.endereco = :endereco"),
		@NamedQuery(name = "Cliente.findByNumero", query = "SELECT c FROM Cliente c WHERE c.numero = :numero"),
		@NamedQuery(name = "Cliente.findByComplemento", query = "SELECT c FROM Cliente c WHERE c.complemento = :complemento"),
		@NamedQuery(name = "Cliente.findByBairro", query = "SELECT c FROM Cliente c WHERE c.bairro = :bairro"),
		@NamedQuery(name = "Cliente.findByCidade", query = "SELECT c FROM Cliente c WHERE c.cidade = :cidade"),
		@NamedQuery(name = "Cliente.findByEstado", query = "SELECT c FROM Cliente c WHERE c.estado = :estado"),
		@NamedQuery(name = "Cliente.findByCep", query = "SELECT c FROM Cliente c WHERE c.cep = :cep"),
		@NamedQuery(name = "Cliente.findByTelefone", query = "SELECT c FROM Cliente c WHERE c.telefone = :telefone"),
		@NamedQuery(name = "Cliente.findByCelular", query = "SELECT c FROM Cliente c WHERE c.celular = :celular"),
		@NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email") })
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_cliente")
	private Integer idCliente;
	@Column(name = "nome")
	private String nome;
	@Column(name = "rg")
	private String rg;
	@Column(name = "cpf")
	private String cpf;
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

	public Cliente() {
	}

	public Cliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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
		hash += (idCliente != null ? idCliente.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) object;
		if ((this.idCliente == null && other.idCliente != null)
				|| (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "criacaobanco.Cliente[ idCliente=" + idCliente + " ]";
	}

}
