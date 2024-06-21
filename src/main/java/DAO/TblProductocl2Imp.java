package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductocl2;

import model.TblProductocl2;

public class TblProductocl2Imp implements IProductocl2 {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_MACHACUAYROJASJHON");
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager = em.createEntityManager();
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		//REGISTRAMOS A LA BASE DE DATOS
		emanager.persist(producto);
		//EMITIR UN MSJ POR PANTALLA
		System.out.println("Producto Registrado en la Base de Datos");
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		//CERRAMOS
		emanager.close();
	}

	@Override
	public List<TblProductocl2> ListarProducto() {
		// TODO Auto-generated method stub
		//establecemos conexion con la unidad de persistencia
        EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_MACHACUAYROJASJHON");
        //getsiona la entidades
        EntityManager emanager = em.createEntityManager();

        //iniciamos la transaccion
        emanager.getTransaction().begin();
        //recuperamos los clientes registrados en la bd
        //**utilizando JPQL***
        //el metodo createQuery del entity manager sirve para la creacion
        //de consultas dinamicas
        List<TblProductocl2> listadoproducto=emanager.createQuery("Select p from TblProductocl2 p", TblProductocl2.class).getResultList();
        //CONFIRMAMOS LA TRANSACCION
        emanager.getTransaction().commit();
        //cerramos
        emanager.close();
        //
        return listadoproducto;
	}
	
}
