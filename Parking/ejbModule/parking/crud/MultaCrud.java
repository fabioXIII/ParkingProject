package parking.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import parking.model.Multa;
import parking.model.MultaResponse;
import parking.util.HibernateUtil;

public class MultaCrud {
	
	Transaction transaction = null;
	Session session = null;

	
	 public MultaResponse insertMulta(Multa model) {
		MultaResponse m = new MultaResponse();

		try { session = HibernateUtil.getSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		session.save(model);
		m.setData(model);
			
		}catch(Exception e ) {
			m.setErr(e.getMessage());
			m.setErr_code("001");
			
		}
	 
		

	return m;
	  
	  
	  
  }

}
