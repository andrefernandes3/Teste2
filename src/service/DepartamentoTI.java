package service;

import java.sql.SQLException;
import java.util.List;

import dao.ChamadoDAO;
import dao.FilaDAO;
import model.Chamado;
import model.Fila;

public class DepartamentoTI {
	private FilaDAO filaDAO;
	private ChamadoDAO chamadoDAO;
	
	public DepartamentoTI (){
		filaDAO = new FilaDAO();
		chamadoDAO = new ChamadoDAO();
	}
	
	public Chamado abrirChamado (Chamado chamado, Fila fila){
		return null;
	}
	public Chamado consultarChamado (int numero){
		return null;
	}
	
	public void fecharChamado (Chamado chamado){

	}
	
	public List <Chamado> listarChamados (Fila fila){
		try{
			return chamadoDAO.listarChamados(fila);
		}catch (SQLException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public List <Fila> listarFilas (){
		try{
			return filaDAO.listarFilas();
		}catch (SQLException e){
			System.out.println(e.getMessage());
			return null;
		}
		
	}
}
