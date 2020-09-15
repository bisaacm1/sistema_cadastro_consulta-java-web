package br.com.isaac.sistema.backinbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.isaac.sistema.bean.Cliente;
import br.com.isaac.sistema.controller.ClienteController;
import br.com.isaac.sistema.util.JSFUtil;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */

@ManagedBean(name = "clienteBacking")
@ViewScoped
public class ClienteBacking {

	private int idCliente;
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

	private Cliente cliente = new Cliente();
	private Cliente clienteSelecionado = new Cliente();
	private List<SelectItem> itensClientes;
	private List<Cliente> listaCliente = new ArrayList<Cliente>();

	private int scrollerPage;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
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

	public List<SelectItem> getItensClientes() {
		return itensClientes;
	}

	public void setItensClientes(List<SelectItem> itensClientes) {
		this.itensClientes = itensClientes;
	}

	public int getScrollerPage() {
		return scrollerPage;
	}

	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public String cadastraCliente() {
		limparDados();
		return "";
	}

	public String consultaCliente() {
		listarCliente();
		return "";
	}

	public String cancelar() {
		limparDados();
		return "cancelar";
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public String salvar() {

		if (validarDados()) {
			Cliente cliente = new Cliente();

			cliente.setNome(nome);
			cliente.setRg(rg);
			cliente.setCpf(cpf);
			cliente.setDataNascimento(dataNascimento);
			cliente.setEndereco(endereco);
			cliente.setNumero(numero);
			cliente.setComplemento(complemento);
			cliente.setBairro(bairro);
			cliente.setCidade(cidade);
			cliente.setEstado(estado);
			cliente.setCep(cep);
			cliente.setTelefone(telefone);
			cliente.setCelular(celular);
			cliente.setEmail(email);

			ClienteController controller = new ClienteController();

			try {
				controller.salvar(cliente);
				limparDados();
				JSFUtil.addInfoMessage("Cliente salvo com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao inserir o cliente!");

			}

		}

		return "";
	}

	public void limparDados() {
		nome = null;
		rg = null;
		cpf = null;
		dataNascimento = null;
		endereco = null;
		numero = 0;
		complemento = null;
		bairro = null;
		cidade = null;
		estado = null;
		cep = null;
		telefone = null;
		celular = null;
		email = null;
	}

	public boolean validarDados() {

		return true;
	}

	public String excluir() {
		ClienteController controller = new ClienteController();

		try {
			controller.excluir(clienteSelecionado);

			JSFUtil.addInfoMessage("Cliente excluido com sucesso!");
		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao excluir Cliente!");

		}

		return "";
	}

	public String alterarCliente() {

		nome = clienteSelecionado.getNome();
		rg = clienteSelecionado.getRg();
		cpf = clienteSelecionado.getCpf();
		dataNascimento = clienteSelecionado.getDataNascimento();
		endereco = clienteSelecionado.getEndereco();
		numero = clienteSelecionado.getNumero();
		complemento = clienteSelecionado.getComplemento();
		bairro = clienteSelecionado.getBairro();
		cidade = clienteSelecionado.getCidade();
		estado = clienteSelecionado.getEstado();
		cep = clienteSelecionado.getCep();
		telefone = clienteSelecionado.getTelefone();
		celular = clienteSelecionado.getCelular();
		email = clienteSelecionado.getEmail();

		return "alterarCliente.xhtml";
	}

	public String alterar() {

		if (validarDados()) {

			clienteSelecionado.setNome(nome);
			clienteSelecionado.setRg(rg);
			clienteSelecionado.setCpf(cpf);
			clienteSelecionado.setDataNascimento(dataNascimento);
			clienteSelecionado.setEndereco(endereco);
			clienteSelecionado.setNumero(numero);
			clienteSelecionado.setComplemento(complemento);
			clienteSelecionado.setBairro(bairro);
			clienteSelecionado.setCidade(cidade);
			clienteSelecionado.setEstado(estado);
			clienteSelecionado.setCep(cep);
			clienteSelecionado.setTelefone(telefone);
			clienteSelecionado.setCelular(celular);
			clienteSelecionado.setEmail(email);

			ClienteController controller = new ClienteController();

			try {
				controller.salvar(clienteSelecionado);
				limparDados();
				JSFUtil.addInfoMessage("Cliente alterado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao alterado o cliente!");

			}

		}

		return "";
	}

	public String listarCliente() {
		this.scrollerPage = 1;

		try {
			this.listaCliente = new ClienteController().buscarTodos();

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os clientes");
		}
		return "";
	}

	public void trartarCLiente() {
		itensClientes = new ArrayList<SelectItem>();
		int i = 1;
		List<Cliente> listaClientes = new ClienteController().buscarTodos();
		itensClientes.add(new SelectItem("0", "Selecione um Cliente"));

		for (Cliente cliente : listaClientes) {
			listaCliente.add(cliente);
			itensClientes.add(new SelectItem(cliente.getNome(), cliente.getNome()));
			i++;
		}

	}

	public List<SelectItem> carregarClientesCombo() {
		trartarCLiente();
		return itensClientes;
	}

	public void init() {
		listarCliente();
	}
}