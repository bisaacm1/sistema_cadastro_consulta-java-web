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
@Table(name = "venda")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
		@NamedQuery(name = "Venda.findByIdVenda", query = "SELECT v FROM Venda v WHERE v.idVenda = :idVenda"),
		@NamedQuery(name = "Venda.findByDescricao", query = "SELECT v FROM Venda v WHERE v.descricao = :descricao"),
		@NamedQuery(name = "Venda.findByQuantidade", query = "SELECT v FROM Venda v WHERE v.quantidade = :quantidade"),
		@NamedQuery(name = "Venda.findByFormaPagamento", query = "SELECT v FROM Venda v WHERE v.formaPagamento = :formaPagamento"),
		@NamedQuery(name = "Venda.findByValor", query = "SELECT v FROM Venda v WHERE v.valor = :valor") })
public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_venda")
	private Integer idVenda;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "quantidade")
	private Integer quantidade;
	@Column(name = "forma_pagamento")
	private String formaPagamento;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "valor")
	private Double valor;

	public Venda() {
	}

	public Venda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
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
		hash += (idVenda != null ? idVenda.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Venda)) {
			return false;
		}
		Venda other = (Venda) object;
		if ((this.idVenda == null && other.idVenda != null)
				|| (this.idVenda != null && !this.idVenda.equals(other.idVenda))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "criacaobanco.Venda[ idVenda=" + idVenda + " ]";
	}

}
