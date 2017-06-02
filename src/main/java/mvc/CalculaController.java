package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/menor-maior")
public class MenorMaiorController extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execu��o.
		String idadeStr = request.getParameter("idade");
		idadeStr = idadeStr == null ? "0" : idadeStr;
		int idade = Integer.parseInt(idadeStr);
		
		//Executa "regras de neg�cio".
		MenorMaiorModel menorMaiorModel = new MenorMaiorModel(idade);
		String resultado = menorMaiorModel.resultado();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("resultado", resultado);
		//Chama p�gina JSP.
		request.getRequestDispatcher("menor-maior-view.jsp").
			forward(request, response);

	}
	
}
