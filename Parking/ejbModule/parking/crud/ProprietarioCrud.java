package parking.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import parking.util.HibernateUtil;
import parking.model.*;
public class ProprietarioCrud {
	
	Transaction transaction = null;
	Session session = null;
	

public List<Proprietario> findAll() {
	List<Proprietario> lista = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return lista;
		////
	}


  public Proprietario findProprietarioById(Integer id) {
	  Proprietario p = new Proprietario();
	  try {
			session = HibernateUtil.getSessionFactory().openSession();
			
			transaction = session.beginTransaction();
			 p= session.get(Proprietario.class, id);
			
		    

		  
	  }catch(Exception e ) {
		  
	  }
	return p;
	  
	  
	  
  }
  
     
   


	}
	

	
	
	


