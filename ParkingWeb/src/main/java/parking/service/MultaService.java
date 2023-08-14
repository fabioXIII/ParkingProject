package parking.service;

import javax.naming.NamingException;

import parking.ejb.*;
import parking.model.Multa;
import parking.model.MultaResponse;

public class MultaService {
	
	private EJBService<MultaEJBRemote> ejb = new EJBService<MultaEJBRemote>();
	
	public MultaResponse insertMulta(Multa model) throws NamingException {
		return 	ejb.getMultaEJBRemote().insertMulta(model);
		

	}


}
