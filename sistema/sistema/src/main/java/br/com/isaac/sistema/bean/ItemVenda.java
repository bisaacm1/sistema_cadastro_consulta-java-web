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
@Table(name = "item_venda")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ItemVenda.findAll", query = "SELECT i FROM ItemVenda i"),
		@NamedQuery(name = "ItemVenda.findByIdItemVenda", query = "SELECT i FROM ItemVenda i WHERE i.idItemVenda = :idItemVenda"),
		@NamedQuery(name = "ItemVenda.findByQuantidade", query = "SELECT i FROM ItemVenda i WHERE i.quantidade = :quantidade"),
		@NamedQuery(name = "ItemVenda.findByValor", query = "SELECT i FROM ItemVenda i WHERE i.valor = :valor") })
public class ItemVenda implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_item_venda")
	private Integer idItemVenda;
	@Column(name = "quantidade")
	private Integer quantidade;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "valor")
	private Double valor;

	public ItemVenda() {
	}

	public ItemVenda(Integer idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public Integer getIdItemVenda() {
		return idItemVenda;
	}

	public void setIdItemVenda(Integer idItemVenda) {
		this.idItemVenda = idItemVenda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idItemVenda != null ? idItemVenda.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ItemVenda)) {
			return false;
		}
		ItemVenda other = (ItemVenda) object;
		if ((this.idItemVenda == null && other.idItemVenda != null)
				|| (this.idItemVenda != null && !this.idItemVenda.equals(other.idItemVenda))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "criacaobanco.ItemVenda[ idItemVenda=" + idItemVenda + " ]";
	}

}
