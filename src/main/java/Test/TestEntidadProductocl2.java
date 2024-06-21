package Test;

import java.util.List;

import DAO.TblProductocl2Imp;
import model.TblProductocl2;


public class TestEntidadProductocl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TblProductocl2 producto= new TblProductocl2();
	        //
	        TblProductocl2Imp crud = new TblProductocl2Imp();
	        
	        /*
	        producto.setNombrecl2("Panes");
	        producto.setPrecioventacl2(2.20);
	        producto.setPreciocompcl2(0.50);
	        producto.setEstadocl2("Del dia");
	        producto.setDescripcl2("Los mas Pedidos");
	        
	        crud.RegistrarProducto(producto);
	      */  
	        
	        List<TblProductocl2> listado = crud.ListarProducto();
			
			//APLICAMOS UN BUCLE
			for(TblProductocl2 lis:listado) {
				//IMPRIMIMOS POR PANTALLA
				System.out.println("Codigo" +lis.getIdproductocl2()+"Nombre" + lis.getNombrecl2() + "Precio Venta"+ lis.getPrecioventacl2()+"Descripción"+ lis.getDescripcl2()
						);
	}

}}
