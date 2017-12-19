package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Chamado;
import model.Fila;
import service.DepartamentoTI;

/**
 * Servlet implementation class GerarChamadosPorFilaServlet
 */
@WebServlet("/GerarChamadosPorFila")
public class GerarChamadosPorFilaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerarChamadosPorFilaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idFila = Integer.parseInt(request.getParameter("id_fila"));
		Fila fila = new Fila();
		fila.setId(idFila);
		DepartamentoTI ti = new DepartamentoTI();
		List <Chamado> chamados = ti.listarChamados(fila);
		request.setAttribute("chamados", chamados);
		RequestDispatcher rd = request.getRequestDispatcher("ExibeChamadosPorFila.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
