package br.com.isaac.sistema.controller;

import java.util.ArrayList;

import br.com.isaac.sistema.bean.Funcionario;
import br.com.isaac.sistema.dao.FuncionarioDAO;
import br.com.isaac.sistema.vo.FuncionarioVO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class FuncionarioController {

	public void salvar(Funcionario funcionario) {
		FuncionarioDAO dao = new FuncionarioDAO();

		try {
			dao.salvar(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Funcionario> buscarTodos() {
		ArrayList<Funcionario> listaRetorno = new ArrayList<Funcionario>();
		FuncionarioDAO dao = new FuncionarioDAO();

		try {
			listaRetorno = dao.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}

//	public ArrayList<Funcionario> buscarNome(String nome) {
//
//		ArrayList<Funcionario> listaRetorno = new ArrayList<Funcionario>();
//		FuncionarioDAO dao = new FuncionarioDAO();
//
//		try {
//			listaRetorno = dao.buscarNome(nome);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return listaRetorno;
//	}

	public void excluir(Funcionario funcionario) {
		FuncionarioDAO dao = new FuncionarioDAO();

		try {
			dao.excluir(funcionario);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public ArrayList<FuncionarioVO> retornaFuncionarios() {
		ArrayList<FuncionarioVO> listaVO = new ArrayList<FuncionarioVO>();

		try {
			ArrayList<Funcionario> listaFuncionarios = new FuncionarioDAO().buscarTodos();
			for (Funcionario funcionario : listaFuncionarios) {
				FuncionarioVO vo = new FuncionarioVO();
				vo.setNome(funcionario.getNome());
				vo.setTelefone(funcionario.getTelefone());
				vo.setDataNascimento(funcionario.getDataNascimento());
				vo.setCidade(funcionario.getCidade());
				listaVO.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaVO;
	}

}
