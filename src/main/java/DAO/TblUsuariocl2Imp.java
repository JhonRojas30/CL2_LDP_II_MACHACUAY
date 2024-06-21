package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Interfaces.IUsuariocl2;
import model.TblUsuariocl2;

public class TblUsuariocl2Imp implements IUsuariocl2  {

	@Override
	public TblUsuariocl2 validarUsuario(String usuario, String password) {
		
        EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_MACHACUAYROJASJHON");
	    EntityManager emanager = em.createEntityManager();
	    try {
	        // Consulta para buscar el usuario por nombre de usuario y contraseña
	        TypedQuery<TblUsuariocl2> query = emanager.createQuery(
	            "SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :usuario AND u.passwordcl2 = :password", TblUsuariocl2.class);
	        query.setParameter("usuario", usuario);
	        query.setParameter("password", password);
	        
	        // Intentar obtener el resultado único, si no se encuentra, devolverá null
	        return query.getSingleResult();
	    } catch (NoResultException e) {
	        // En caso de no encontrar el usuario, manejar la excepción adecuadamente
	        return null;
	    } finally {
	        em.close();
	    }
	}}

		
		
	
