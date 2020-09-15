package br.com.isaac.sistema.controller;

import java.util.ArrayList;

import br.com.isaac.sistema.bean.Cliente;
import br.com.isaac.sistema.dao.ClienteDAO;
import br.com.isaac.sistema.vo.ClienteVO;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class ClienteController {

	public void salvar(Cliente cliente) {
		ClienteDAO dao = new ClienteDAO();

		try {
			dao.salvar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Cliente> buscarTodos() {
		ArrayList<Cliente> listaRetorno = new ArrayList<Cliente>();
		ClienteDAO dao = new ClienteDAO();

		try {
			listaRetorno = dao.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}

	public void excluir(Cliente cliente) {
		ClienteDAO dao = new ClienteDAO();

		try {
			dao.excluir(cliente);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public ArrayList<ClienteVO> retornaClientes() {
		ArrayList<ClienteVO> listaVO = new ArrayList<ClienteVO>();

		try {
			ArrayList<Cliente> listaClientes = new ClienteDAO().buscarTodos();
			for (Cliente cliente : listaClientes) {
				ClienteVO vo = new ClienteVO();
				vo.setNome(cliente.getNome());
				vo.setTelefone(cliente.getTelefone());
				vo.setDataNascimento(cliente.getDataNascimento());
				vo.setCidade(cliente.getCidade());
				listaVO.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaVO;
	}

}
