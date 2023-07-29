package br.com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.dao.CidadeDAO;
import br.com.dao.ClienteDAO;
import br.com.dao.EstadoDAO;
import br.com.dao.FabricanteDAO;
import br.com.dao.PessoaDAO;
import br.com.domain.Cidade;
import br.com.domain.Cliente;
import br.com.domain.Estado;
import br.com.domain.Fabricante;
import br.com.domain.Pessoa;

public class EstadoDAOTest {
	
	@Test
	@Ignore
	public void salvarEstado(){
		Estado estado = new Estado();
		
		estado.setNome("Rio Grande do Sul");
		estado.setSigla("RS");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		
		
	}
	
	@Test
	@Ignore
	public void listarEstado(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> estados = estadoDAO.listar();
		
		for(Estado estado : estados){
			System.out.println(estado.getNome()+" "+estado.getSigla());
		}
		
	}
	
	@Test
	@Ignore
	public void buscarEstado(){
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3l);
		
		System.out.println(estado.getNome());
		
		
	}
	
	@Test
	@Ignore
	public void excluirEstado(){
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3l);
		
		estadoDAO.excluir(estado);
		
		System.out.println(estado.getNome());
		
	}
	
	@Test
	@Ignore
	public void editarEstado(){
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3l);
		
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");
		estadoDAO.editar(estado);
		
		System.out.println(estado.getNome());
		
	}
	
	@Test
	@Ignore
	public void salvarFabricante(){
		Fabricante fabricante = new Fabricante();
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		
		fabricante.setDescricao("Aché");
		
		fabricanteDAO.salvar(fabricante);
		
	}
	
	@Test
	@Ignore
	public void salvarCidade() throws ParseException{
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		
		pessoa = pessoaDAO.buscar(1l);
		cliente.setDataDoCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("29/07/2023"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);
		
		clienteDAO.merge(cliente);
		
		
	}
	
	@Test
	@Ignore
	public void listarCidade(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> cidades = cidadeDAO.listar();
		
		System.out.println(cidades.size());
		
	}
	
	@Test
	@Ignore
	public void buscarCidade(){
		Cidade cidade = new CidadeDAO().buscar(1l);
		System.out.println(cidade.getNome());
	}
	
	@Test
	@Ignore
	public void excluirCidade(){
		Long codigo = 4l;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = new Cidade();
		
		cidade = cidadeDAO.buscar(codigo);
		cidadeDAO.excluir(cidade);
		
	}
	
	@Test
	@Ignore
	public void editarCidade(){
		
		Long codigo = 2l;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = new Cidade();
		
		cidade = cidadeDAO.buscar(codigo);
		cidade.setNome("Andradas");
		cidade.setEstado(new EstadoDAO().buscar(3l));
		
		cidadeDAO.editar(cidade);
		
	}
	
	@Test
	@Ignore
	public void fabricanteMerge(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(1l);
		
		fabricante.setDescricao("Jhonson&Jhonson");
		
		fabricanteDAO.merge(fabricante);
		
	}
	
	

}
