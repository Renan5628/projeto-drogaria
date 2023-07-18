package br.com.util;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.dao.EstadoDAO;
import br.com.dao.FabricanteDAO;
import br.com.domain.Estado;
import br.com.domain.Fabricante;

public class EstadoDAOTest {
	
	@Test
	@Ignore
	public void salvarTeste(){
		Estado estado = new Estado();
		
		estado.setNome("Rio Grande do Sul");
		estado.setSigla("RS");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		
		
	}
	
	@Test
	@Ignore
	public void listarTeste(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> estados = estadoDAO.listar();
		
		for(Estado estado : estados){
			System.out.println(estado.getNome()+" "+estado.getSigla());
		}
		
	}
	
	@Test
	@Ignore
	public void buscarTeste(){
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3l);
		
		System.out.println(estado.getNome());
		
		
	}
	
	@Test
	@Ignore
	public void excluirTeste(){
		
		EstadoDAO estadoDAO = new EstadoDAO();
		
		Estado estado = estadoDAO.buscar(3l);
		estadoDAO.excluir(estado);
		
		System.out.println(estado.getNome());
		
		
	}
	
	@Test
	@Ignore
	public void editarTeste(){
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3l);
		
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");
		estadoDAO.editar(estado);
		
		System.out.println(estado.getNome());
		
	}
	
	@Test
	public void salvarTesteFabricante(){
		Fabricante fabricante = new Fabricante();
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		
		fabricante.setDescricao("Medley");
		
		fabricanteDAO.salvar(fabricante);
		
	}

}
