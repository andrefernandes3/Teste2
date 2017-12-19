package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Fila;

public class FilaDAO {

	public List<Fila> listarFilas() throws SQLException{
		String sql = "SELECT * FROM FILA";
		List <Fila> filas = new ArrayList <Fila> ();
		try (Connection conn = ConnectionFactory.obterConexao();PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();){
				while (rs.next()){
					filas.add(new Fila (rs.getInt("ID_FILA"), rs.getString("NM_FILA")));
				}			
		}
		return filas;
	}

}
