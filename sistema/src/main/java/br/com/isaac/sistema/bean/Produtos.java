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
@Table(name = "produtos")

@NamedQueries({ @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
		@NamedQuery(name = "Produtos.findByIdProduto", query = "SELECT p FROM Produtos p WHERE p.idProduto = :idProduto"),
		@NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao"),
		@NamedQuery(name = "Produtos.findByValorProduto", query = "SELECT p FROM Produtos p WHERE p.valorProduto = :valorProduto") })
public class Produtos implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_produto")
	private Integer idProduto;
	@Column(name = "descricao")
	private String descricao;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "valor_produto")
	private Double valorProduto;

	public Produtos() {
	}

	public Produtos(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idProduto != null ? idProduto.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Produtos)) {
			return false;
		}
		Produtos other = (Produtos) object;
		if ((this.idProduto == null && other.idProduto != null)
				|| (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "criacaobanco.Produtos[ idProduto=" + idProduto + " ]";
	}

}
