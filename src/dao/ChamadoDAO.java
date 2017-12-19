package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Chamado;
import model.Fila;

public class ChamadoDAO {

	public List<Chamado> listarChamados(Fila fila) throws SQLException{
		String sql = "SELECT * FROM CHAMADO WHERE ID_FILA = ?";
		List <Chamado> chamados = new ArrayList <>();
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, fila.getId());
			try (ResultSet rs = ps.executeQuery()){
				while (rs.next()){
					Chamado chamado = new Chamado ();
					chamado.setNumero(rs.getInt("ID_CHAMADO"));
					chamado.setDescricao(rs.getString("DESCRICAO"));
					chamado.setStatus(rs.getString("STATUS_CHAMADO"));
					Calendar calendar = Calendar.getInstance();
					calendar.setTimeInMillis(rs.getDate("DT_ABERTURA").getTime());
					chamado.setDataAbertura(calendar);
					Calendar dataFechamento = null;
					java.sql.Date aux = rs.getDate("DT_FECHAMENTO");
					if (aux != null){
						dataFechamento = Calendar.getInstance();
						dataFechamento.setTimeInMillis(aux.getTime());
					}
					chamado.setDataFechamento(dataFechamento);
					chamados.add(chamado);
				}
			}
		}
		return chamados;
	}

}
