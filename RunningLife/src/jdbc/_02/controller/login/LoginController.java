package jdbc._02.controller.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc._02.model.member.MemberJDBCDAO;
import jdbc._02.model.member.MemberVO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/pages/login.controller")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		String firstName = request.getParameter("firstName");
		HttpSession session = request.getSession();
		MemberVO mvo = mDAO.findByFirstName(firstName);
		session.setAttribute("login", mvo);
		RequestDispatcher rd = request.getRequestDispatcher("/friend/index.jsp");
		rd.forward(request, response);
	}

}
