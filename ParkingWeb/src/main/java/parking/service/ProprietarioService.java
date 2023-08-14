package parking.service;

import javax.naming.NamingException;

import org.springframework.stereotype.Service;

import parking.ejb.*;
import parking.model.ProprietarioResponse;
import parking.service.*;
import parking.ejb.*;
@Service
public class ProprietarioService {
	
	private EJBService<ProprietarioEJBRemote> ejb = new EJBService<ProprietarioEJBRemote>();
	
	
	public void saluta() {
	try {
		ejb.getProprietarioEJBRemote().saluta();
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	public ProprietarioResponse findProprietarioById(Integer id ) throws NamingException {
		ProprietarioResponse p= new ProprietarioResponse();
		
		return p= ejb.getProprietarioEJBRemote().findProprietarioById(id);
		
		
	}
	



}
