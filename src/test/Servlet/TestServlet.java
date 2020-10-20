package test.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = ""; // url to forward to

		// Lấy giá trị thông số từ form request
		String name = request.getParameter("customerName");
		String email = request.getParameter("customerEmail");
		String quantity = request.getParameter("quantity");

		// If any are empty, set the url to forward to to the error page.
		// Otherwise, forward to the normal reciept
		if (name.equals("") || email.equals("") || quantity.equals("")) {
			url = "/error.jsp";
		} else {
			double pricePerUnit = 9.95;
			int quantityNumber = Integer.parseInt(quantity);
			double totalCost = pricePerUnit * quantityNumber;
			request.setAttribute("quantity", "" + quantityNumber);
			request.setAttribute("pricePerUnit", "" + pricePerUnit);
			request.setAttribute("cost", "" + totalCost);
			url = "/reciept.jsp";
		}

		// Create the dispatcher from the url and perform the forward
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
		doGet(request, response);
	}
}
