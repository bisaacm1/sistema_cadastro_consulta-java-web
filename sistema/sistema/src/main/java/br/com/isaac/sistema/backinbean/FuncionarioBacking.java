package br.com.isaac.sistema.backinbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.isaac.sistema.bean.Funcionario;
import br.com.isaac.sistema.controller.FuncionarioController;
import br.com.isaac.sistema.util.JSFUtil;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */

@ManagedBean(name = "funcionarioBacking")
@ViewScoped
public class FuncionarioBacking {

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

	private Funcionario funcionario = new Funcionario();
	private Funcionario funcionarioSelecionado = new Funcionario();
	private List<SelectItem> itensFuncionarios;
	private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	private int scrollerPage;

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

	public List<SelectItem> getItensFuncionarios() {
		return itensFuncionarios;
	}

	public void setItensFuncionarios(List<SelectItem> itensFuncionarios) {
		this.itensFuncionarios = itensFuncionarios;
	}

	public int getScrollerPage() {
		return scrollerPage;
	}

	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}

	public void setListaFuncionario(List<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}

	public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
		this.funcionarioSelecionado = funcionarioSelecionado;
	}

	public String cadastraFuncionario() {
		limparDados();
		return "";
	}

	public String consultaFuncionario() {
		listarFuncionario();
		return "";
	}

	public String cancelar() {
		limparDados();
		return "cancelar";
	}

	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}

	public String salvar() {

		if (validarDados()) {
			Funcionario funcionario = new Funcionario();

			funcionario.setNome(nome);
			funcionario.setRg(rg);
			funcionario.setCpf(cpf);
			funcionario.setDataNascimento(dataNascimento);
			funcionario.setEndereco(endereco);
			funcionario.setNumero(numero);
			funcionario.setComplemento(complemento);
			funcionario.setBairro(bairro);
			funcionario.setCidade(cidade);
			funcionario.setEstado(estado);
			funcionario.setCep(cep);
			funcionario.setTelefone(telefone);
			funcionario.setCelular(celular);
			funcionario.setEmail(email);

			FuncionarioController controller = new FuncionarioController();

			try {
				controller.salvar(funcionario);
				limparDados();
				JSFUtil.addInfoMessage("Funcionario salvo com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao inserir o funcionario!");

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
		FuncionarioController controller = new FuncionarioController();

		try {
			controller.excluir(funcionarioSelecionado);

			JSFUtil.addInfoMessage("Funcionario excluido com sucesso!");
		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao excluir Funcionario!");

		}

		return "";
	}

	public String alterarFuncionario() {

		idFuncionario = funcionarioSelecionado.getIdFuncionario();
		nome = funcionarioSelecionado.getNome();
		rg = funcionarioSelecionado.getRg();
		cpf = funcionarioSelecionado.getCpf();
		dataNascimento = funcionarioSelecionado.getDataNascimento();
		endereco = funcionarioSelecionado.getEndereco();
		numero = funcionarioSelecionado.getNumero();
		complemento = funcionarioSelecionado.getComplemento();
		bairro = funcionarioSelecionado.getBairro();
		cidade = funcionarioSelecionado.getCidade();
		estado = funcionarioSelecionado.getEstado();
		cep = funcionarioSelecionado.getCep();
		telefone = funcionarioSelecionado.getTelefone();
		celular = funcionarioSelecionado.getCelular();
		email = funcionarioSelecionado.getEmail();

		return "alterarFuncionario.xhtml";
	}

	public String alterar() {

		if (validarDados()) {

			funcionarioSelecionado.setIdFuncionario(idFuncionario);
			funcionarioSelecionado.setNome(nome);
			funcionarioSelecionado.setRg(rg);
			funcionarioSelecionado.setCpf(cpf);
			funcionarioSelecionado.setDataNascimento(dataNascimento);
			funcionarioSelecionado.setEndereco(endereco);
			funcionarioSelecionado.setNumero(numero);
			funcionarioSelecionado.setComplemento(complemento);
			funcionarioSelecionado.setBairro(bairro);
			funcionarioSelecionado.setCidade(cidade);
			funcionarioSelecionado.setEstado(estado);
			funcionarioSelecionado.setCep(cep);
			funcionarioSelecionado.setTelefone(telefone);
			funcionarioSelecionado.setCelular(celular);
			funcionarioSelecionado.setEmail(email);

			FuncionarioController controller = new FuncionarioController();

			try {
				controller.salvar(funcionarioSelecionado);
				limparDados();
				JSFUtil.addInfoMessage("Funcionario alterado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao alterado o funcionario!");

			}

		}

		return "";
	}

	public String listarFuncionario() {
		this.scrollerPage = 1;

		try {
			this.listaFuncionario = new FuncionarioController().buscarTodos();

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os funcionarios");
		}
		return "";
	}

	public void trartarCLiente() {
		itensFuncionarios = new ArrayList<SelectItem>();
		int i = 1;
		List<Funcionario> listaFuncionarios = new FuncionarioController().buscarTodos();
		itensFuncionarios.add(new SelectItem("0", "Selecione um Funcionario"));

		for (Funcionario funcionario : listaFuncionarios) {
			listaFuncionario.add(funcionario);
			itensFuncionarios.add(new SelectItem(funcionario.getNome(), funcionario.getNome()));
			i++;
		}

	}

	public List<SelectItem> carregarFuncionariosCombo() {
		trartarCLiente();
		return itensFuncionarios;
	}

	@PostConstruct
	public void init() {
		listarFuncionario();
	}
}