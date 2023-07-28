package br.com.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.dao.ClienteDAO;
import br.com.domain.Cliente;

@SuppressWarnings("serial")
@ViewScoped
@ManagedBean
public class ClienteBean implements Serializable {
	
	private List<Cliente> clientes;
	

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@PostConstruct
	public void listar(){
		
	try{	
		ClienteDAO clienteDAO = new ClienteDAO();
		clientes = clienteDAO.listar("dataDoCadastro");
		
	} catch (Exception e) {
		e.printStackTrace();
		Messages.addGlobalError("Ocorreu um erro na listagem.");
	}
	}

}
