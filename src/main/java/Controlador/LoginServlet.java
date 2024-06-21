package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TblUsuariocl2Imp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TblUsuariocl2Imp crud = new TblUsuariocl2Imp();
		
		 String usuario = request.getParameter("usuario");
	        String password = request.getParameter("password");

	        TblUsuariocl2 usr = crud.validarUsuario(usuario, password);
	        if (usr != null) {
	            request.getRequestDispatcher("insertarproductos.jsp").forward(request, response);
	        } else {
	            request.setAttribute("error", "Usuario o contraseña incorrectos");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    }
	}


