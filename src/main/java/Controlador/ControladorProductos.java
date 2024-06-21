package Controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TblProductocl2Imp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProductos
 */
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TblProductocl2Imp crud = new TblProductocl2Imp();
		List<TblProductocl2> listadoproducto =crud.ListarProducto();
		//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
		request.setAttribute("ListadoProductos", listadoproducto);
		
		//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
		//REDIRECCIONAMOS
		request.getRequestDispatcher("/listadoproductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		double preve = Double.parseDouble(request.getParameter("preve"));
		double preco =  Double.parseDouble(request.getParameter("preco"));
		String est = request.getParameter("est");
		String desc = request.getParameter("desc");
		
		
		//INSTANCIAMOS LAS RESPECTIVAS CLASES
		TblProductocl2 producto = new TblProductocl2();
		TblProductocl2Imp crud = new TblProductocl2Imp();
		//ASIGNAMOS LOS VALORES
		producto.setNombrecl2(nombre);
		producto.setPrecioventacl2(preve);
		producto.setPreciocompcl2(preco);
		producto.setEstadocl2(est);
		producto.setDescripcl2(desc);
		
		
		//INVOCAMOS EL METEODO A REGISTRAR
		crud.RegistrarProducto(producto);
		//ACTUALIZAR EL LSITADO
		List<TblProductocl2> listadoproducto =crud.ListarProducto();
		//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
		request.setAttribute("ListadoProductos", listadoproducto);
		//REDIRECCIONAMOS A LISTADO
		request.getRequestDispatcher("/listadoproductos.jsp").forward(request, response);
	}

}
